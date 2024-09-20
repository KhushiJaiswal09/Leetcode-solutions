class Solution {
    public void rotate(int[] nums, int k) {
        
        int n=nums.length;     
        int i=0, j=n-1;
        k=(k>n)?k%n:k;
        
        while (j>i){
            swap(nums, i, j);
            i++;
            j--;
        }

        i=0; j=k-1;
        int x=k, y=n-1;
        while (i<j){
            swap(nums, i, j);
            i++;
            j--;
        }
        while (x<y){
            swap(nums, x, y);
            x++;
            y--;
        }
    }

    static void swap(int[] nums, int num1, int num2){
        int temp=nums[num1];
        nums[num1]=nums[num2];
        nums[num2]=temp;
    }
}