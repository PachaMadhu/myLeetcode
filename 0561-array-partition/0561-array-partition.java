class Solution {
    public int arrayPairSum(int[] nums) {
        // int l=2;
        int x=0;
        int ans=0;

        Arrays.sort(nums);

        for(int i=0;i<nums.length-1;i+=2){
            x=Math.min(nums[i],nums[i+1]);
            ans+=x;
        }   

        return ans;
       
    }
}