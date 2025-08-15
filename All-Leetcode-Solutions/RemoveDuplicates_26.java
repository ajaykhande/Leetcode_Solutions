public class RemoveDuplicates_26 {

    // Removes duplicates from sorted array in-place, returns new length
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // Edge case: empty array

        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k]) { // Found new unique element
                k++;
                nums[k] = nums[i]; 
            }
        }
        return k + 1; // Length of unique elements
    }

    // Another way to remove duplicates from sorted array
    public static int removeDuplicates_02(int[] nums) {
        if (nums.length == 0) return 0; // Edge case: empty array

        int k = 0; 
        int i;
        for (i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) { // Found unique element
                nums[k] = nums[i];
                k++;
            }
        }
        nums[k] = nums[i]; // Add the last element
        return k + 1; // Length of unique elements
    }
    public static void main(String[] args) {
      int [] nums = {0,0,1,1,1,2,2,3,3,4};
     
        int newLength = removeDuplicates(nums);
        
        // Print only the remaining valid elements
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}


