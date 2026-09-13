```java id="f4n2qp"
import java.util.Scanner;

class ArrayRotator {

    static int[] rotateArray(int[] nums, int k) {

        // Reduce k if it is greater than array length
        k = k % nums.length;

        // Create new array
        int[] newArray = new int[nums.length];

        // Place each element at its new position
        for (int i = 0; i < nums.length; i++) {

            int newPosition = (i + k) % nums.length;

            newArray[newPosition] = nums[i];
        }

        // Copy newArray back into nums
        for (int i = 0; i < nums.length; i++) {
            nums[i] = newArray[i];
        }

        return nums;
    }
}


public class MainArrayRotator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter rotation value k: ");
        int k = sc.nextInt();

        int[] result = ArrayRotator.rotateArray(nums, k);

        System.out.print("Rotated array: ");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
```
