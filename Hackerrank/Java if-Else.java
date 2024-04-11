import java.util.*;

class FirstCode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            if (num > 1 && num < 6)
                System.out.println("Not Weird");
            if (num > 5 && num < 21)
                System.out.println("Weird");
            if (num > 20)
                System.out.println("Not Weird");
        } else
            System.out.println("Weird");
        sc.close();
    }

}