class Solution {
    public int minimumPushes(String word) {

        int ans=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        PriorityQueue<freq> pq=new PriorityQueue<>((a,b)->b.fre-a.fre);

        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }else{
                hm.put(c,1);
            }
        }

        for(char x:hm.keySet()){
            pq.add(new freq(x,hm.get(x)));
        }

        int count=0;
        while(!pq.isEmpty()){
            if(count<8){
                ans+=pq.poll().fre;
            }else if(count<16){
                ans=ans+pq.poll().fre*2;
            }else if(count<24){
                ans=ans+pq.poll().fre*3;
            }else{
                ans=ans+pq.poll().fre*4;
            }
            count++;
        }

        return ans;
    }
}
class freq{
    char data;
    int fre;
    freq(char data,int fre){
        this.data=data;
        this.fre=fre;
    }
}