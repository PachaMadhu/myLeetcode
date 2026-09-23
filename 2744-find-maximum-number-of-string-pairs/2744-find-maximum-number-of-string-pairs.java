class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int ans=0;
        for(int i=0;i<words.length;i++){
            String s=words[i];
            char c1=s.charAt(0);
            char c2=s.charAt(1);
            for(int j=i+1;j<words.length;j++){
                String s2=words[j];
                char x1=s2.charAt(0);
                char x2=s2.charAt(1);
                if(c1==x2 && c2==x1){
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}