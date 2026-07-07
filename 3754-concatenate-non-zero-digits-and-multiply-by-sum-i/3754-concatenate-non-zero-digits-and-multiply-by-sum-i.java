class Solution {
    public long sumAndMultiply(int n) {        
        List<Integer> l=new ArrayList<>();

        int a=n;
        int rev=0;

        while(a>0){
            int p=a%10;
            if(p!=0){
                rev=rev*10+p;
                l.add(p);
            }
            a/=10;
        }

        int newnum=0;
        while(rev>0){
            int dig=rev%10;
            newnum= newnum*10+dig;
            rev/=10;
        }

        int x=0;
        for(int i:l){
            x+=i;
        }

        return (long)x*newnum;
    }
}