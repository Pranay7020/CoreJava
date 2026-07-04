package Level_1;

import java.util.Scanner;

public class ConditionsQ2 {
    public static void main(String[] args){
//     Check if a number is even or odd.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("number is even");
        }
        else {
            System.out.println("number is odd");
        }

    }
}
