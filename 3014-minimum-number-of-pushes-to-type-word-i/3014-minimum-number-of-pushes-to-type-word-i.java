class Solution {
    public int minimumPushes(String word) {
        if(word.length()<=8){
            return word.length();
        }

        int n=word.length();
        int ans=8;
        if(n>8){
            ans+=Math.min(n-8,8)*2;
        }
        if(n>16){
            ans+=Math.min(n-16,8)*3;
        }if(n>24){
            ans+=Math.min(n-24,8)*4;
        }

        return ans;
    }
}