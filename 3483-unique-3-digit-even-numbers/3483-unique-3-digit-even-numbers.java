class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> s=new HashSet<>();
        int ans=0;

        for(int i=0;i<digits.length;i++){
            if(digits[i]==0)continue;   //----> we are skipping 0 cause it makes 2 digit number
            for(int j=0;j<digits.length;j++){
                if(i==j)continue;       //-------> ignore same number cause it was already used at hundreadth place
                for(int k=0;k<digits.length;k++){
                    if(k==i ||k==j)continue;    ///---> same like tens place
                    int x=(digits[i]*100)+(digits[j]*10)+digits[k]; // make a 3 digit number
                    if(!s.contains(x)&&x%2==0){ //---> checking if it was even and also not there in set
                        ans++;
                        s.add(x);
                    }
                }
            }
        }

        return ans;
    }
}