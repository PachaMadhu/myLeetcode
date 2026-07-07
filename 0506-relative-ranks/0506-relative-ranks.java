class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<rank> pq=new PriorityQueue<>((a,b)->b.score-a.score);
        for(int i=0;i<score.length;i++){
            int s=score[i];
            int p=i;
            rank r=new rank(s,p);
            pq.add(r);
        }
        
        String arr[]=new String[score.length];

        int x=1;
        for(int i=0;i<score.length;i++){
            rank r=pq.poll();
            int s=r.score;
            int p=r.position;

            if(x==1){
                arr[p]="Gold Medal";
            }else if(x==2){
                arr[p]="Silver Medal";
            }else if(x==3){
                arr[p]="Bronze Medal";
            }else{
                arr[p]=String.valueOf(x);
            }
            x++;
        }
        return arr;
    }
}
class rank{
    int score;
    int position;
    rank(int score,int position){
        this.score=score;
        this.position=position;
    }
}