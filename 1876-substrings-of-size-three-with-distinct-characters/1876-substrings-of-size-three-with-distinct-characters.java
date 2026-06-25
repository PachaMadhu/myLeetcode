class Solution {
    public int countGoodSubstrings(String s) {
        int sl=3;
        int l=0;
        int ans=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
            if(i-l==sl){
                sb.deleteCharAt(0);
                l++;
            }
            if(i-l+1==sl){
                HashMap<Character,Integer> hm=new HashMap<>();
                int x=0;
                for(int j=0;j<sb.length();j++){
                    char c=sb.charAt(j);
                    if(hm.containsKey(c)){
                        x++;
                        break;
                    }else{
                        hm.put(c,1);
                    }
                }
                if(x==0){
                        ans++;
                }
            }
        }

        return ans;
    }
}