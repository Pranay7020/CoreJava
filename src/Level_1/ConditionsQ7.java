package Level_1;

import java.util.Scanner;

public class ConditionsQ7 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if(a>b && a>c){
            System.out.println("A is grater");

        } else if (b>a && b>c) {
            System.out.println("b is gretter");

        }
        else{
            System.out.println(" c gretter");
        }
    }
}
