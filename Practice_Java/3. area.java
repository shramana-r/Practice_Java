package Practice_Java;

import java.util.*;

class area {
    public static void areaOfCircle(int r) {
        double ar = 3.14 * (r * r);
        System.out.println("Area of circle:-" + ar);
    }

    public static void areaOfSquare(int s) {
        int ar = s * s;
        System.out.println("Area of square:-" + ar);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:-");
        int r = sc.nextInt();
        System.out.println("Enter the side of the square:-");
        int s = sc.nextInt();
        areaOfCircle(r);
        areaOfSquare(s);
        sc.close();
    }

}
