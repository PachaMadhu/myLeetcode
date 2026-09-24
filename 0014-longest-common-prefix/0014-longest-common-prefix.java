class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n=strs.length;
        StringBuilder sb=new StringBuilder();
        int len=Math.min(strs[0].length(),strs[n-1].length());
        for(int i=0;i<len;i++){
            if(strs[0].charAt(i)!=strs[n-1].charAt(i)){
                break;
            }
            sb.append(strs[0].charAt(i));
        }
        return sb.toString();
    }
}