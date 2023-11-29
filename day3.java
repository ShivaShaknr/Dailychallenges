//function-hidepassword

import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count_alp = 0;
        int count_dig = 0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                count_dig++;
            }
            else if(Character.isLetter(s.charAt(i))){
                count_alp++;
            }
        }
        if(count_dig<=count_alp){
            String res = "";
            for(int i=0;i<s.length();i++){
                if(Character.isLetter(s.charAt(i))){
                    res+="*";
                }
                else{
                    res+=s.charAt(i);
                }
            }
            System.out.println(res);
        }
        else{
            String res = "";
            for(int i=0;i<s.length();i++){
                if(Character.isDigit(s.charAt(i))){
                    res+="*";
                }
                else{
                    res+=s.charAt(i);
                }
            }
            System.out.println(res);
        }

    }
}
