class Solution {
    public int romanToInt(String s) {
        int x=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='I'){
                if(i!=s.length()-1 &&s.charAt(i+1)=='V'){
                    x+=4;
                    i++;
                }else if(i!=s.length()-1 &&s.charAt(i+1)=='X'){
                    x+=9;
                    i++;
                }else{
                    x+=1;
                }
            }else if(c=='V'){
                x+=5;
            }else if(c=='X'){
                if(i!=s.length()-1 &&s.charAt(i+1)=='L'){    
                    x+=40;
                    i++;
                }else if(i!=s.length()-1 &&s.charAt(i+1)=='C'){
                    x+=90;
                    i++;
                }else{
                    x+=10;
                }
            }else if(c=='L'){
                x+=50;
            }else if(c=='C'){
                // x+=100;
                if(i!=s.length()-1 &&s.charAt(i+1)=='D'){
                    x+=400;
                    i++;
                }else if(i!=s.length()-1 &&s.charAt(i+1)=='M'){
                    x+=900;
                    i++;
                }else{
                    x+=100;
                }
            }else if(c=='D'){
                x+=500;
            }else if(c=='M'){
                x+=1000;
                
            }
        }

        return x;
    }
}