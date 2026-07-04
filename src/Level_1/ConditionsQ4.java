package Level_1;

import java.util.Scanner;

public class ConditionsQ4 {
    public static  void main(String[] args){
//        Check if a number is divisible by both 3 and 5
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        if(n%3==0&&n%5==0){
            System.out.println("dividedd by both");


        }
        else{
            System.out.println("not dividedd by both");
        }
    }
}
