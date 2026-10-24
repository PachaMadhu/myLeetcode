class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        
        int a1=stringtonum(arriveAlice);
        int a2=stringtonum(leaveAlice);
        int b1=stringtonum(arriveBob);
        int b2=stringtonum(leaveBob);

        int start=Math.max(a1,b1);
        int end=Math.min(a2,b2);

        return Math.max(0,end-start+1);
    }
    public int stringtonum(String s){
        int mon=0;
        int day=0;
        boolean bool=false;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='-'){
                bool=true;
                continue;
            }
            if(!bool){
                mon=mon*10+(c-'0');
            }else{
                day=day*10+(c-'0');
            }
        }

        mon=month(mon);
        return mon+day;
    }
    public int month(int a){
        int arr[]={0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int x=0;
        for(int i=0;i<a;i++){
            x+=arr[i];
        }

        return x;
    }
}