class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0){
            return false;
        }
        long long a=x;
        long long s=0;
        while (a != 0) {
            s = s * 10 + a % 10;
            a = a / 10;
        }
        if(x==s){
            return true;
        }
        return false;
    }
};
