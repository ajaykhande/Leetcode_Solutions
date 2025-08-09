class Leetcode_88 {
    public static  void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int p1 = m - 1;         // Last valid index in nums1
        int p2 = n - 1;         // Last index in nums2
        int p = m + n - 1;      // Last position in nums1 (final array)

        // Compare from the end and place the larger element at the back
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // Copy remaining elements from nums2 (if any)
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
     public static void main(String[] args) {
     int [] nums1 = {1,2,3,0,0,0};
     int [] nums2 = {2,5,6};
     int n = nums2.length;
     int m = nums2.length;
    
    merge(nums1, m, nums2, n);
       for(int   merge:  nums1 ){
        System.out.print(merge + " ");
      
       }
    }
}


