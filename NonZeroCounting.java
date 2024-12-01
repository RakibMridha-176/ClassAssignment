package ClassAssignment;

//code by Rakib Mridha

import java.util.*;

public class NonZeroCounting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("The number of elements: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int nonZero = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                nonZero++;
            }
        }
        System.out.println("Number of non-zero elements:: " + nonZero);
    }
}

