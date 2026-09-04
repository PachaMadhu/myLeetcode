class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length-1;

        for(int i=0;i<=n;i++){
            if(nums[i]==val){
                while(n>=0&&nums[n]==val){
                    n--;
                }
                if(i<=n){
                    int temp=nums[i];
                    nums[i]=nums[n];
                    nums[n]=temp;
                    n--;
                }
            }
        }

        return n+1;
    }
}