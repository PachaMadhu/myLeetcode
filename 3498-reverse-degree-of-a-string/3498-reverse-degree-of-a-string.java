class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int x=26-(s.charAt(i)-'a'+1)+1;
            sum=sum+(x*(i+1));
        }
        return sum;
    }
}