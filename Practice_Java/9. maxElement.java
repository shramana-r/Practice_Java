package Practice_Java;

import java.util.*;

class maxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for (int j = 0; j < arr.length; j++) {
            System.out.println("Enter an element");
            arr[j] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[max])
                max = i;
        }
        System.out.println("Maximum element-" + arr[max]);
        sc.close();
    }

}
