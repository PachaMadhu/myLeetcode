class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }

        int x=0;
        int a=1;
        while(true){
            int p=k*a;
            if(!hs.contains(p)){
                x=p;
                break;
            }
            a++;
        }
        return x;
    }
}