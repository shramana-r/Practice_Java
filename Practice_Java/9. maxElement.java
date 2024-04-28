package Practice_Java;

import java.util.*;

class maxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array-");
        int l = sc.nextInt();
        int arr[] = new int[l];
        for (int j = 0; j < arr.length; j++) {
            System.out.println("Enter elements: ");
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
