package Practice_Java;

import java.util.*;

class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks:-");
        int mark = sc.nextInt();
        if (mark <= 30)
            System.out.println("GRADE:-C");
        if (mark > 30 && mark <= 70)
            System.out.println("GRADE:-B");
        if (mark > 70 && mark <= 90)
            System.out.println("GRADE:-A");
        if (mark > 90 && mark <= 100)
            System.out.println("GRADE:-A+");
        sc.close();
    }

}
