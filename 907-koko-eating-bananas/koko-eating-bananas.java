class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = getMax(piles);
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (min_hours(piles, mid) > h) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }      
        return left;
    }
    
    static int min_hours(int[] piles, int k) {
        int count = 0;
        for (int pile : piles) {
            count += Math.ceil((double) pile / k);
        }
        return count;
    }

    static int getMax(int[] piles) {
        int max = Integer.MIN_VALUE;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return max;
    }
}
