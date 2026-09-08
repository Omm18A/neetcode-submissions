class Solution {
    public int evalRPN(String[] tokens) {
        int ans=0;
        Stack<Integer>a=new Stack<>();
        for(String s:tokens){
            if(s.equals("+")){
                int top=a.pop();
                ans=top+a.peek();
                a.pop();
                a.push(ans);
            }
            else if(s.equals("*")){
                int top=a.pop();
                ans=top*a.peek();
                a.pop();
                a.push(ans);
            }
            else if(s.equals("/")){
                int top=a.pop();
                if(top!=0){
                    ans=a.peek()/top;
                }
                a.pop();
                a.push(ans);
           }
            else if(s.equals("-")){
                int top=a.pop();
                ans=a.peek()-top;
                a.pop();
                a.push(ans);
            }
            else{
                a.push(Integer.parseInt(s));
                ans+=a.peek();
            }
        }
        return ans;
    }
}
