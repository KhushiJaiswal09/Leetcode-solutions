class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result=new int[2];
        HashMap<Integer, Integer> map=new HashMap<>();

        for(int i=0; i<numbers.length; i++){

            if(map.containsKey(target-numbers[i])){
                result[0]=map.get(target-numbers[i])+1;
                result[1]=i+1;
            }
            map.put(numbers[i], i);
        }

        return result;
    }
}