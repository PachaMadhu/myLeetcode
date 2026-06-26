class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int x=0;
        int n=nums.length;

        for(int i = 0; i < n; i++) {
            int a = 0;
            for(int j = i; j < n; j++) {
                if(nums[j] == target)
                    a++;
                if(a > (j - i + 1) / 2)
                    x++;
            }
        }
        
        // int sl=1;
        // for(int i=0;i<n;i++){
        //     int j=sl;
            
        // }
        return x;
    }
}