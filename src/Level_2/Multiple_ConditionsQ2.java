package Level_2;

import java.util.Scanner;

public class Multiple_ConditionsQ2
{
//    If the sides form a valid triangle, determine whether it is equilateral, isosceles, or scalene.

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        if((a+b>c) && (b+c>a)&&(a+c>b)){
//            equilateral
            if((a==b) && (b==c) &&(a==c)){
                System.out.println("equilateral");
                System.out.println("this is triangle");
            }
//            Isosceles: Any two sides are equal.
            else if ((a==b) || (b==c)){
                System.out.println("Isosceles");
                System.out.println("trianagle");


            }
            else {
                System.out.println("Valid Triangle");
                System.out.println("Scalene Triangle");
            }
        }
        else {
            System.out.println("Not a Valid Triangle");
        }

    }
}

