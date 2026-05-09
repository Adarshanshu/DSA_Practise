package DSA_Practise.Day03;

import java.util.*;

public class twoPointer {

    public static void twoSum(int nums[], int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int sum = nums[left] + nums[right];

            if (sum == target) {

                System.out.println("Pair found: "
                        + nums[left] + " and " + nums[right]);

                return;
            }

            else if (sum < target) {
                left++;
            }

            else {
                right--;
            }
        }

        System.out.println("No pair found.");
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int nums[] = new int[n];

        System.out.println("Enter sorted array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        twoSum(nums, target);

        sc.close();
    }
}