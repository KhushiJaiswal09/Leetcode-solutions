class Solution {
    public int diagonalSum(int[][] mat) {
     int rows= mat.length;
     int cols= mat.length;  
     int sum=0; 
        for(int i=0; i< rows; i++){
           sum=sum+ mat[i][i]; 
        }
         for(int i=0; i< rows; i++){
           if(i==rows-i-1){
            sum=sum;
           }else{
            sum=sum+ mat[i][rows-i-1];
           }
        }

        return sum;
    }

}