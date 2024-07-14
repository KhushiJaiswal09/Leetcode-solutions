class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num;  // update the smallest value
            } else if (num <= second) {
                second = num;  // update the second smallest value
            } else {
                // if we find a number greater than both first and second, we found our triplet
                return true;
            }
        }
        return false;
    }
}
