class Solution {
    public boolean checkDivisibility(int n) {
        int a=summ(n)+mul(n);

        if(n%a==0){
            return true;
        }

        return false;
    }
    public int summ(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            n/=10;
        }
        return sum;
    }
    public int mul(int n){
        int mu=1;
        while(n>0){
            int d=n%10;
            mu*=d;
            n/=10;
        }
        return mu;
    }
}