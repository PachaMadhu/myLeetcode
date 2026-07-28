class Solution {
    public int maximumProduct(int[] nums) {
        int large1=Integer.MIN_VALUE;
        int large2=Integer.MIN_VALUE;
        int large3=Integer.MIN_VALUE;

        int small=Integer.MAX_VALUE;
        int sec_small=Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>large1){
                large3=large2;
                large2=large1;
                large1=nums[i];
            }else if(nums[i]>large2){
                large3=large2;
                large2=nums[i];
            }else if(nums[i]>large3){
                large3=nums[i];
            }

            if(nums[i]<small){
                sec_small=small;
                small=nums[i];
            }else if(nums[i]<sec_small){
                sec_small=nums[i];
            }
        }

        int a=(small*sec_small)*large1;
        int b=large1*large2*large3;
        return Math.max(a,b);
    }
}

/* they were ask to find the max value of there products

now if there are two negative numbers lets say -100 -100 product is -10000 which was in negative if it was mutily with 
positve it will give a big positive number which might be a bigger number than the actual 3 lagest number in array

in question they ask the anwer should be the highest not the values that we take

*/