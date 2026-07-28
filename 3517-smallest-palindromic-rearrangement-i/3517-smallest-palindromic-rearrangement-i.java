class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()==1){
            return s;
        }

        int arr[]=new int[26];

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            arr[c-'a']++;
        }

        StringBuilder left=new StringBuilder();
        String mid="";

        for(int i=0;i<26;i++){
            for(int j=0;j<arr[i]/2;j++){
                left.append((char)(i+'a'));
            }
        }

        for(int i=0;i<26;i++){
            if(arr[i]%2==1){
                mid=String.valueOf((char)(i+'a'));
            }
        }

        StringBuilder right=new StringBuilder(left).reverse();


        return left.toString()+mid+right.toString();
    }
}

/* here i stored the preqency of numbers in an array then
        i stored the half of freq in a string
        now the single characters
        then the reverse of the half freq
*/
