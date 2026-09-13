```java id="x7q2mn"
import java.util.Scanner;

class RotatedArray {

    static int findMin(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            // If middle is greater than right,
            // minimum is in the right half
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            }

            // Otherwise, minimum is in the left half
            else {
                right = mid;
            }
        }

        return nums[left];
    }
}


public class MainRotatedArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = RotatedArray.findMin(nums);

        System.out.println("Minimum element: " + result);

        sc.close();
    }
}
```
