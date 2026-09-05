class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int maxx=Integer.MIN_VALUE;

        int suffixmin[]=new int[n];
        suffixmin[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffixmin[i]=Math.min(suffixmin[i+1],nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            maxx=Math.max(maxx,nums[i]);
            if(maxx-suffixmin[i]<=k){
                return i;
            }
        }
        return -1;
    }
}