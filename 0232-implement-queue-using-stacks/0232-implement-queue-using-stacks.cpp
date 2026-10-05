class MyQueue {
public:
stack<int>st;
stack<int>temp;
    MyQueue() {
        
    }
    
    void push(int x) {
        while(!temp.empty()){
            int top=temp.top();
            st.push(top);
            temp.pop();
        }
        st.push(x);
        while(!st.empty()){
            int tem=st.top();
            temp.push(tem);
            st.pop();
        }
    }
    
    int pop() {
        int top=temp.top();
        temp.pop();
        return top;
    }
    
    int peek() {
        return temp.top();
    }
    
    bool empty() {
        return  temp.empty();
    }
};

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue* obj = new MyQueue();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->peek();
 * bool param_4 = obj->empty();
 */