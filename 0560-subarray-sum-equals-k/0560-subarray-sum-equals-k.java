class Solution {
    public int subarraySum(int[] nums, int k) {
        // int prefix[]=new int[nums.length+1];
        // int ans=0;
        // for(int i=0;i<nums.length;i++){
        //     int x=0;
        //     for(int j=i;j<nums.length;j++){
        //         x+=nums[j];

        //         if(x==k){
        //             ans++;
        //         }
        //     }     
        // }

        // return ans;


        int prefix[]=new int[nums.length+1];

        for(int i=0;i<nums.length;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }

        int ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
               if(prefix[j+1]-prefix[i]==k){
                    ans++;
               }
            }
        }

        return ans;



    }
}
