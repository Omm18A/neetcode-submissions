class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>a=new Stack<>();
        int res=0;
        for(String s: operations){
            if(s.equals("+")){
                int top=a.pop();
                int newtop=top+a.peek();
                a.push(top);
                a.push(newtop);
                res+=newtop;
            }
            else if(s.equals("D")){
                a.push(2 * a.peek());
                res+=a.peek();
            }
            else if(s.equals("C")){
                res-=a.peek();
                a.pop();
            }
            else{
                a.push(Integer.parseInt(s));
                res+=a.peek();
            }
        }
        return res;
    }
}