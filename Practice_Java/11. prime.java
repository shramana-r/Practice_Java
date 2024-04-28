package Practice_Java;

import java.util.*;

class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int check = 0;
        System.out.println("Enter a number-");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                check++;
            }
        }
        if (check == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
        sc.close();
    }
}
