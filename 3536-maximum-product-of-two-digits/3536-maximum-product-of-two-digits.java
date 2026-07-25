class Solution {
    public int maxProduct(int n) {
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        while(n!=0){
            int a=n%10;
            if(a>first){
                second=first;
                first=a;
            }else if(a>second){
                second=a;
            }
            n/=10;
        }

        return first*second;
    }
}