class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int largest=nums[nums.length-1];
        int small=nums[0];
        
        List<Integer> l=new ArrayList<>();
        for(int i=small;i<=largest;i++){
            l.add(i);
        }
        for(int i=0;i<nums.length;i++){
            if(l.contains(nums[i])){
                l.remove(Integer.valueOf(nums[i]));
            }
        }

        return l;
    }
}