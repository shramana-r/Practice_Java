package Practice_Java;

import java.util.*;

class leapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year:");
        int num = sc.nextInt();
        boolean check = false;
        if (num % 100 == 0) {
            if (num % 400 == 0) {
                check = true;
            }
        } else if (num % 4 == 0) {
            check = true;
        }
        if (check == true)
            System.out.println("Leap Year");
        else
            System.out.println("Not a leap year");
        sc.close();
    }
}
