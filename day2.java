//convert to octal and sum of digits

import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = Integer.parseInt(Integer.toOctalString(n));
        System.out.println(adddig(k));

    }
    public static int adddig(int n){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }
}
