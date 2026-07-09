class Solution {
    public void moveZeroes(int[] nums) {
        // Arrays.sort(nums);
        Queue<Integer> Q=new LinkedList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                Q.add(nums[i]);
            }
        }
        int n=nums.length-Q.size();
        for(int i=0;i<n;i++){
            Q.add(0);
        }
        int j=0;
        for(int i:Q){
            nums[j]=i;
            j++;
        }


    }
}