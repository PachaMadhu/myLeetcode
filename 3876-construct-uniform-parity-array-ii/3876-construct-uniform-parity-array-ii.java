class Solution {
    public boolean uniformArray(int[] nums1) {
        
        int small=Integer.MAX_VALUE;
        int x=0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]<small){
                small=nums1[i];
                x=i;
            }
        }

        if(small%2==0){
            return even(nums1,x);
        }
        if(small%2!=0){
            return odd(nums1,x);
        }

        return false;
    }
    public boolean even(int nums1[],int x){
        int nums2[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2==0){
                nums2[i]=nums1[i];
            }else{
                nums2[i]=nums1[i]-nums1[x];
            }
        }
        return check(nums2);
    }
    public boolean odd(int nums1[],int x){
        int nums2[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2!=0){
                nums2[i]=nums1[i];
            }else{
                nums2[i]=nums1[i]-nums1[x];
            }
        }
        return check(nums2);
    }
    public boolean check(int nums2[]){
        int x=0;
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]%2==0){
                x++;
            }
        }
        if(x==0 || x==nums2.length){
            return true;
        }
        return false;
    }
}

// 6 -90        even even even ------ X
// 6-103 97    even odd odd
// 3 96 93     odd even odd
// 3 103 100   odd odd even ------- X