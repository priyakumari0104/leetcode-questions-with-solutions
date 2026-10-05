class MinStack {
Stack<Integer>st;
Stack<Integer>minStack;
    public MinStack() {
    st=new Stack<>();
    minStack=new Stack<>();
    }
    
    public void push(int value) {
        st.push(value);
        if(minStack.size()==0){
            minStack.push(value);
        }else if(minStack.peek()>=value){
            minStack.push(value);
        }
    
    }
    
    public void pop() {
        
        if(minStack.peek()>=st.peek()){
            minStack.pop();
        }
        st.pop();
    }

    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */