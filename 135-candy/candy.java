class Solution {
    public int candy(int[] ratings) {

        int[] candy = new int[ratings.length];
        Arrays.fill(candy, 1);

        int result = ratings.length;

        for (int i = 1; i < ratings.length; i++) {

            if (ratings[i] > ratings[i - 1]) {

                int newCandy = candy[i - 1] + 1;
                result += newCandy - candy[i];
                candy[i] = newCandy;
            }
        }

        for (int i = ratings.length - 2; i >= 0; i--) {

            if (ratings[i] > ratings[i + 1]) {

                int newCandy = Math.max(candy[i], candy[i + 1] + 1);
                result += newCandy - candy[i];
                candy[i] = newCandy;
            }
        }

        return result;
    }
}