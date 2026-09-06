class Solution {
    public int findNumbers(int[] nums) {
        return evendigits(nums);
    }

    static int evendigits(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int check = arr[i];

            int ans = countDigits(check);

            if (ans % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    static int countDigits(int n) {
        int count = 0;

        while (n != 0) {
            n = n / 10;
            count++;
        }

        return count;
    }
}