package Practice_Java;

import java.util.*;

class posNegZero {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:-");
        int num = sc.nextInt();
        if (num < 0)
            System.out.println("Negative number");
        if (num > 0)
            System.out.println("Positive number");
        else if (num == 0)
            System.out.println("Zero");
        sc.close();
    }

}