class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        return peek(arr, 0);
    }

    static int peek(int[] arr, int i) {
        int max = Integer.MIN_VALUE; 
        int ans = 0;
        
        if (i == arr.length) {
            return 0;
        }
        
           if (i == 0 || arr[i] > arr[i - 1]) {
            return peek(arr, i + 1);
        } else {
            return i - 1;
        }
    }
}
