class Solution {
    public int[] plusOne(int[] digits) {

        ArrayList<Integer> nums=new ArrayList<>();

        for(int i=0; i<digits.length; i++){
            nums.add(digits[i]);
        }

        nums.set(digits.length-1  , digits[digits.length-1]+1);

        for (int i = nums.size() - 1; i > 0; i--) {

            if (nums.get(i) >= 10) {
                nums.set(i, nums.get(i) % 10);
                nums.set(i - 1, nums.get(i - 1) + 1);
            }

        }
        if(nums.get(0)>9){
            int x=nums.get(0)/10;
            int y=nums.get(0)%10;
            nums.set(0, x);
            nums.add(y);
           
        }
        
        int[] arr = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            arr[i] = nums.get(i);
        }

        return arr;
    }
}