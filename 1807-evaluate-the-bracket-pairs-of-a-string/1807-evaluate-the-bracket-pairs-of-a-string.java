class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> hm=new HashMap<>();
        for(List<String> k:knowledge){
            hm.put(k.get(0),k.get(1));
        }
        
        StringBuilder sb=new StringBuilder();
        int a=-1;
        int b=-1;
        boolean bool=true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                a=i;
                bool=false;
                continue;
            }if(s.charAt(i)==')'){
                b=i;
            }
            if(a!=-1 && b!=-1){
                String str=s.substring(a+1,b);
                if(hm.containsKey(str)){
                    sb.append(hm.get(str));
                }else{
                    sb.append('?');
                }
                a=-1;
                b=-1;
                bool=true;
                continue;
            }
            if(bool){
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}