public class RemoveDuplicates2_80 {
     public static  int removeDuplicates2(int[] nums) {
        if (nums.length <= 2) return nums.length; // If length <= 2, all elements are fine

        int writeIndex = 2; // Next position to write
        
        for (int i = 2; i < nums.length; i++) {
            // If current element is not same as the element two places before
            if (nums[i] != nums[writeIndex - 2]) {
                nums[writeIndex] = nums[i];
                writeIndex++;
            }
        }
        return writeIndex; 
    }

 
    public static void main(String[] args) {
      int [] nums = {0,0,1,1,1,2,3,3,3,4,};
     
        int newLength = removeDuplicates2(nums);
        
        // Print only the remaining valid elements
        for (int i = 0; i <newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
