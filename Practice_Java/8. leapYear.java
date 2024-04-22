package Practice_Java;

import java.util.*;

class leapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days of the year:");
        int num = sc.nextInt();
        if (num > 365 && num < 367)
            System.out.println("Leap year");
        else if (num == 365)
            System.out.println("Non-leap year");
        else
            System.out.println("Not possible");
        sc.close();
    }
}
