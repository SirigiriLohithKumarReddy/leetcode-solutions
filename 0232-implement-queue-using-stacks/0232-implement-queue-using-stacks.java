class MyQueue {
    Stack <Integer> s1 = new Stack<>();
    Stack <Integer> s2 = new Stack<>();


    public MyQueue() {
        
    }
    
    public void push(int x) {
        s1.push(x);
     
    }
    
    public int pop() {
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int a = s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
     return  a;  
    }
    
    public int peek() {
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int b = s2.peek();
        
        if(s2.isEmpty())
        return 0;
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return b;
    }
    
    public boolean empty() {
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        return s2.isEmpty();
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