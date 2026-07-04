package Level_1;

import java.util.Scanner;

public class ConditionsQ6 {
    public static void main(String args[]){
//        Take two numbers and print the larger one.
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();

        if(n>m){
            System.out.println("n is gretter then m"+""+n);
        }
        else{
            System.out.println("m is gretter then n"+" "+m);

        }

    }
}
