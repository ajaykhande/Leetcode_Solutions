import java.util.Arrays;
class candy_135 {
    public static int candy(int[] ratings) {
        int n = ratings.length;
        int totalCandies = 0;
        
        // Array to store candies given to each child
        int[] candies = new int[n];
        Arrays.fill(candies, 1); // Every child gets at least 1 candy

        // Left to right: Give more candy if rating is higher than left neighbor
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Right to left: Give more candy if rating is higher than right neighbor
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // Sum up all candies
        for (int candy : candies) {
            totalCandies += candy;
        }

        return totalCandies;
    }

    public static void main(String[] args) {
        int[] ratings = {1, 3, 4, 5, 2};
        System.out.println(candy(ratings));
    }
}
