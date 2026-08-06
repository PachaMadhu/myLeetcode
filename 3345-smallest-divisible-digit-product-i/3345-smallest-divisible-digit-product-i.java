class Solution {
    public int smallestNumber(int n, int t) {
        return solve(n,t);
    }
    public int solve(int n,int t){
        int temp=n;
        int mul=1;
        while(temp>0){
            int digit=temp%10;
            mul=mul*digit;
            temp/=10;
        }
        if(mul%t==0){
            return n;
        }
        return solve(n+1,t);
    }
}