import java.util.Arrays;

public class H_Index_274 {
       public static int hIndexOptimize(int[] citations) {
    int n = citations.length;

    // Step 1: Create a frequency array where index = citation count
   
    int[] count = new int[n + 1];
    for (int num : citations) {
        if (num >= n) {
            count[n]++; // papers with n or more citations
        } else {
            count[num]++; 
        }
    }

    // Step 2: Traverse from the highest citation count downwards
    int totalPapers = 0; 
    for (int i = n; i >= 0; i--) {
        totalPapers += count[i];
        if (totalPapers >= i) {
            return i; // found the H-index
        }
    }

    return 0;
}

 public static  int hIndex(int[] citations) {
    // Sort the citations array in ascending order
    Arrays.sort(citations);

    int i = 0;
    int ans = citations.length; // Maximum possible H-index (total papers)

    while (i < citations.length) {
      
        if (citations[i] >= ans) {

            return ans; // Found H-index
        }
        i++;
        ans--;
    }

    return ans; 
}
    public static void main(String[] args) {
        int[] nums = {3,0,6,1,5};
      
       // int ans = hIndex(nums);
        int ans = hIndexOptimize(nums);

        System.out.println(ans);
}
}