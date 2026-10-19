class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list=new ArrayList<>();
        int val=-1;
        int tar=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<target){
                val++;
            }
            if(nums[i]==target){
                tar++;
            }
        }
        for(int i=1;i<=tar;i++){
            list.add(val+i);
        }
        return list;
    }
}