package Level_1;

import java.util.Date;
import java.util.Scanner;

public class ConditionsQ5 {
    public static void main(String[] args){
//Check if a given year is a leap year.
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        if(n%400==0){
                System.out.println("leap year");

        }
        else{
            System.out.println("not a leep year");
        }
    }
}
