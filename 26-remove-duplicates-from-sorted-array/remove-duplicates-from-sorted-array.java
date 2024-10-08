class Solution {
    public int removeDuplicates(int[] nums) {
        
        if (nums.length == 0) {
            return 0;
        }
        
        int count = 1;
        int currentIndex = 1; 
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[currentIndex] = nums[i];
                count++;
                currentIndex++;
            }
        }
        
        return count;
    }
}
