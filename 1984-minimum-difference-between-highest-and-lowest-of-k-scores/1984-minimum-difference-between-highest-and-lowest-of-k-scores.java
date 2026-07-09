class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0;
        int ans=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(i-l==k){
                l++;
            }
            if(i-l+1==k){
                int j=i+k-1;
                int temp=nums[i]-nums[l];
                ans=Math.min(ans,temp);
            }
        }

        return ans;
    }
}