class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int ans=0;
        int l=0;
        int sum=0;
        for(int r=0;r<arr.length;r++){
            sum+=arr[r];
            if(r-l==k){
                sum-=arr[l];
                l++;
            }
            if(r-l+1==k){
                if(sum/k>=threshold){
                    ans++;
                }
            }
        }

        return ans;
    }
}