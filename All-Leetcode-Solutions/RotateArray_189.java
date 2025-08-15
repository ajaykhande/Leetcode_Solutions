
public class RotateArray_189 {
    
    // Method to reverse part of the array from 'st' to 'end'
    public static int[] reverseKTime(int[] nums, int st, int end) {
        int i = st, j = end - 1; // end is exclusive
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        return nums;
    }

    // Rotate array by k steps
    public static int[] rotate(int[] nums, int k) {
        k = k % nums.length; // Handle if k > length

        // Step 1: Reverse entire array
        reverseKTime(nums, 0, nums.length);

        // Step 2: Reverse first k elements
        reverseKTime(nums, 0, k);

        // Step 3: Reverse remaining elements
        reverseKTime(nums, k, nums.length);

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] arr = rotate(nums, k);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
