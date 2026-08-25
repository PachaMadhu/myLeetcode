class Solution {
    public int missingMultiple(int[] nums, int k) {
        
        int x=1;
        int ans=1;
        boolean b=true;
        while(b){
            b=false;
            ans=k*x;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==ans){
                    b=true;
                    break;
                }
            }
            x++;
        }
        return ans;
    }
}