package DSA_Practise.Day03;

import java.util.Scanner;

public class linearSearch {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int nums[] = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the target you want to find:");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {

            if (nums[i] == target) {

                System.out.println("Target found at index -> " + i);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Target not found in the array.");
        }

        sc.close();
    }
}