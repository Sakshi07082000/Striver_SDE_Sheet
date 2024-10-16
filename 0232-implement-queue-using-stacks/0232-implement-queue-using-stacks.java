class MyQueue 
{
    Stack<Integer> st1, st2;

    public MyQueue() 
    {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    
    public void push(int x) 
    {
        st1.push(x);
    }
    
    public int pop() 
    {
        peek();
        return st2.pop();
    }
    
    public int peek() 
    {
        if(st2.empty()) //if output(st2) stack is empty
            
            /*push elements of input(st1) stack to output(st2) stack till
            input(st1) stack is not empty*/
            while(!st1.empty())
                st2.push(st1.pop());
        
        //return peek()of output stack(st2)
        return st2.peek();
    }
    
    public boolean empty() 
    {
        //check if both stacks are empty
        return st2.isEmpty() && st1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */