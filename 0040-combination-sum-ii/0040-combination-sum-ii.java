class Solution 
{
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
        Arrays.sort(candidates);
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        getcombinationII (0, candidates, target, current, answer);
        return answer;
    }
    
    void getcombinationII(int index, int[] candidates, int target, List<Integer> current, List<List<Integer>> answer)
    {
        if(target==0)
        {
            answer.add(new ArrayList(current));
            return;
        }
        
        for(int i=index; i<candidates.length; i++)
        {
            //check for repeated elements at different indexes [1,1,1,....]
            if(i != index && candidates[i] == candidates[i-1])
                continue;
            if(candidates[i] > target)
                break;
            
            current.add(candidates[i]);
            //picking an element
            getcombinationII(i+1, candidates, target-candidates[i], current, answer);
            current.remove(current.size()-1);
            
            // we are not picking an element in only two conditions 
            //1. when element greater then target
            //2. when element id duplicate
            //we have laready checked both the cases therefore not including the not picked recursion call
        }
    }
}