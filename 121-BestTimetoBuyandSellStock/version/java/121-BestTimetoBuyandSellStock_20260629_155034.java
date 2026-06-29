// Last updated: 6/29/2026, 3:50:34 PM
1class MinStack {
2    Stack<Integer> st ;
3    Stack<Integer> minStack ;
4    public MinStack() {
5        st = new Stack();
6        minStack = new Stack();
7    }
8    
9    public void push(int value) {
10        st.add(value);
11        if(minStack.isEmpty() || minStack.peek() >= value){
12            minStack.push(value);
13        }
14    }
15    
16    public void pop() {
17       if(st.isEmpty())return ;
18       if(st.peek().equals(minStack.peek())){
19        minStack.pop();
20       } 
21       st.pop();
22    }
23    
24    public int top() {
25        if(st.isEmpty()){
26            return -1;
27        }
28        return st.peek();
29    }
30    
31    public int getMin() {
32        if(minStack.isEmpty()){
33            return -1;
34        }
35        return minStack.peek();
36    }
37    
38}
39
40/**
41 * Your MinStack object will be instantiated and called as such:
42 * MinStack obj = new MinStack();
43 * obj.push(value);
44 * obj.pop();
45 * int param_3 = obj.top();
46 * int param_4 = obj.getMin();
47 */