package Level_2;

import java.util.Scanner;

public class Multiple_ConditionsQ1 {
    public static void main(String[] args) {

        // Take three sides and check if they form a valid triangle.

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if ((A + B > C) && (A + C > B) && (B + C > A)) {
            System.out.println("It is a valid triangle.");
        } else {
            System.out.println("It is not a valid triangle.");
        }
    }
}