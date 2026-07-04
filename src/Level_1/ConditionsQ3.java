package Level_1;

import java.util.Scanner;

public class ConditionsQ3 {
    public static void main(String args[]){
//                Check if a number is divisible by 5.Check if a number is divisible by 5.
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        if (n%5==0){
            System.out.println("divided by 5");
        }
        else{
            System.out.println("not divided  by 5");
        }
    }
}
