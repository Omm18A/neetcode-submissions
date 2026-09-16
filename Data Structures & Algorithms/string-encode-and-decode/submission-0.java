class Solution {

    public String encode(List<String> strs) {
        String a="";
        for(int i=0;i<strs.size();i++){
            a+=strs.get(i).length()+":"+strs.get(i);
        }
        //decode(a);       
        return a;
    }

    public List<String> decode(String str) {
        List<String>b=new ArrayList<>();
        int start=0;
        while(start<str.length()){
            int i=start;    
            while(str.charAt(i)!=':'){
                i++;
            }
            int a=Integer.parseInt(str.substring(start,i));
            String c=str.substring(i+1,i+1+a);
            b.add(c);
            start=i+1+a;
        }
        return b;
    }
}
