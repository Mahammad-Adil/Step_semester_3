```java id="k2m7px"
import java.util.*;

class ThreeSum {

    static int[][] threeSum(int[] nums) {

        // Step 1: Sort the array
        Arrays.sort(nums);

        ArrayList<int[]> result = new ArrayList<>();

        // Step 2: Fix one element
        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            // Step 3: Two-pointer search
            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    result.add(new int[]{
                        nums[i], nums[left], nums[right]
                    });

                    // Skip duplicate left values
                    while (left < right &&
                           nums[left] == nums[left + 1]) {
                        left++;
                    }

                    // Skip duplicate right values
                    while (left < right &&
                           nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;

                } else if (sum < 0) {

                    // Need a larger sum
                    left++;

                } else {

                    // Need a smaller sum
                    right--;
                }
            }
        }

        // Convert ArrayList<int[]> to int[][]
        int[][] answer = new int[result.size()][];

        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}


public class MainThreeSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[][] result = ThreeSum.threeSum(nums);

        System.out.println("Unique triplets:");

        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }

        sc.close();
    }
}
```
