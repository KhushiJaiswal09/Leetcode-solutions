class Solution {
    public int removeElement(int[] nums, int val) {
        
        int count =0;
        ArrayList<Integer> arr=new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                arr.add(nums[i]);
            }
        }
        
        count = arr.size();

        for(int i=0; i<count; i++){
            nums[i]=arr.get(i);
        }

        return count;
    }
}