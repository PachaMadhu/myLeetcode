class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        int twenty=0;
        for(int i=0;i<bills.length;i++){
            if(ten<0||five<0||twenty<0)return false;
            if(bills[i]==5){
                five++;
            }else if(bills[i]==10){
                if(five==0){
                    return false;
                }else{
                    five--;
                }
                ten++;
            }else if(bills[i]==20){
                if(ten==0){
                    if(five==0){
                        return false;
                    }else{
                        five=five-3;
                    }
                }else{
                    ten--;
                    five--;
                }
                twenty++;
            }
        }

        if(ten<0||five<0||twenty<0)return false;

        return true;
    }
}