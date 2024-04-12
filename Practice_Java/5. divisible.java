package Practice_Java;

import java.util.*;

class divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int num = sc.nextInt();
        System.out.println("Enter the number to check if the previous number is divisible by this:-");
        int check = sc.nextInt();
        if (num % check == 0)
            System.out.println("Divisible");
        else
            System.out.println("Not divisible");
        sc.close();
    }

}
