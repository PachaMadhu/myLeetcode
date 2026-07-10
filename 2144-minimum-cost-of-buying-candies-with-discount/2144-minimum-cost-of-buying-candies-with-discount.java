class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        
        int x=0;
        int ans=0;
        for(int i=cost.length-1;i>=0;i--){
            if(x==2){
                x=0;
            }else{
                ans+=cost[i];
                x++;
            }
        }

        return ans;
    }
}