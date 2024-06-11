class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
   
   int[] maximum= Arrays.copyOf(candies, candies.length);
   Arrays.sort(maximum);
   int max= maximum[maximum.length - 1]; 

   List<Boolean> result = new ArrayList<>(candies.length);

   for(int i=0; i< candies.length; i++){

    if((candies[i] + extraCandies) >= max){
    result.add(true);
   }
   else{
    result.add(false);
   }
   

    }
     return result;
    }

}