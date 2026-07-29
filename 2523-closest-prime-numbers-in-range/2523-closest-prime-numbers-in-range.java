class Solution {
    public int[] closestPrimes(int left, int right) {
        List<Integer> l=new ArrayList<>();

        for(int i=left;i<=right;i++){
            if(isprime(i)){
                l.add(i);
            }
        }
        if(l.size()<2){
            return new int []{-1,-1};
        }

        int a=-1;
        int b=-1;
        int mindiff=Integer.MAX_VALUE;
        for(int i=1;i<l.size();i++){
            int diff=l.get(i)-l.get(i-1);
            if(diff<mindiff){
                mindiff=diff;
                a=l.get(i-1);
                b=l.get(i);
            }
        }

        return new int[]{a,b};

    }
    public boolean isprime(int n){
        if(n<2){
            return false;
        }

        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }

}