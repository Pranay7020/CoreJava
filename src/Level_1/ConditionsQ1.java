package Level_1;

import java.util.Scanner;

public class ConditionsQ1 {
    public static void main(String args[]){
//Take a number and print whether it’s positive, negative, or zero.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n>0){
            System.out.println("this number is positive");

        } else if (n<0) {
            System.out.println("this is negative");

        }
        else{
            System.out.println("number is zero");
        }
    }
}
