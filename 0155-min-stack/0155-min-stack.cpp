class MinStack {
public:
stack<int>st;
stack<int>temp;
    MinStack() {
        
    }
    
    void push(int value) {
        if(temp.size()==0||temp.top()>=value){
            temp.push(value);
        }
        st.push(value);
    }
    
    void pop() {
        int top=st.top();
        st.pop();
        if(top==temp.top()){
            temp.pop();
        }

    }
    
    int top() {
    int top=st.top();
    
    return top;
    }
    
    int getMin() {
        int top=temp.top();
        return top;
    }
};

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack* obj = new MinStack();
 * obj->push(value);
 * obj->pop();
 * int param_3 = obj->top();
 * int param_4 = obj->getMin();
 */