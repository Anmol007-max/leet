class Solution {
    public int searchInsert(int[] nums, int target) {
        return search(nums, target);
    }

    static int search(int[] arr, int t) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= t) {
                return i;
            }
        }

        return arr.length;
    }
}