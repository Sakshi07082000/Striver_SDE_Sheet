class Solution 
{
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        getcombination(0, candidates, target, current, answer );
        return answer;
    }
    
    void getcombination(int index, int[] candidates, int target, List<Integer> current, List<List<Integer>> answer)
    {
        if(index == candidates.length)
        {
            if(target==0)
                answer.add(new ArrayList(current));
            return;
        }
        
        if(candidates[index] <= target)
        {
            current.add(candidates[index]);
            getcombination(index, candidates, target - candidates[index], current, answer);
            current.remove(current.size()-1);
        }
        getcombination(index+1, candidates, target, current, answer);
    }
}