package Practice_Java;

import java.util.*;

/**
 * sumTwoNum
 */
class sumTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 number:-");
        int n1 = sc.nextInt();
        System.out.print("Enter second number:-");
        int n2 = sc.nextInt();
        int n3 = n1 + n2;
        System.out.println("Sum of two numbers= " + n3);
        sc.close();
    }

}