class MyQueue {
     Stack<Integer>st;
     Stack<Integer>temp;
    public MyQueue() {
      st=new Stack<>();
      temp=new Stack<>();
    }
    
    public void push(int x) {
        
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        st.push(x);
       while(!st.isEmpty()){
          temp.push(st.pop());
       }
    }
    
    public int pop() {
       return temp.pop();
    }
    
    public int peek() {
        return temp.peek();
    }
    
    public boolean empty() {
        return temp.isEmpty();
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