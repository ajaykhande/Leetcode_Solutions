class RemoveElement_27 {
public static int removeElement(int[] nums, int val) {
        int k = 0; // position for next non-val element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) { 
                nums[k] = nums[i]; 
                k++;
            }
        }
        return k; // new length after removal
    }

    public static void main(String[] args) {
      int [] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        
        int newLength = removeElement(nums, val);
        
        // Print only the remaining valid elements
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}