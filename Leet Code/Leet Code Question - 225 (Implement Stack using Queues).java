import java.util.*;

class MyStack {
    Queue<Integer> q1 = new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        for(int i = 0; i < q1.size()-1; i++) {
            q1.add(q1.poll());
        }
        
        int x = q1.remove();
        return x;
    }
    
    public int top() { // peek
        for(int i = 0; i < q1.size()-1; i++) {
            q1.add(q1.remove());
        }
        
        int x = q1.peek();
        q1.add(q1.remove());
        
        return x;
    }
    
    public boolean empty() {
        if(q1.size() == 0) {
            return true;
        } 
        else {
            return false;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */