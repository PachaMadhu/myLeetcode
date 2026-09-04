class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int maxx=Integer.MIN_VALUE;
        int n = nums.length;
        
        int[] suffixMin=new int[n];
        suffixMin[n-1]=nums[n-1];

        for (int i=n-2;i>=0;i--) {
            suffixMin[i]=Math.min(nums[i],suffixMin[i+1]);
        }

        for(int i=0;i<nums.length;i++){
            maxx=Math.max(maxx,nums[i]);
            if(maxx-suffixMin[i]<=k){
                return i;
            }
        }

        return -1;
    }
}
