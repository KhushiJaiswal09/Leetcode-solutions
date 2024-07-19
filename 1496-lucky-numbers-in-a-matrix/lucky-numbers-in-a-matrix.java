class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> luckyNums = new ArrayList<>();
        
        // Iterate over each row to find the minimum element
        for(int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            int minIndex = 0;
            for(int j = 1; j < matrix[0].length; j++) {
                if(matrix[i][j] < min) {
                    min = matrix[i][j];
                    minIndex = j;
                }
            }
            
            // Check if this minimum element is the maximum in its column
            boolean isLucky = true;
            for(int k = 0; k < matrix.length; k++) {
                if(matrix[k][minIndex] > min) {
                    isLucky = false;
                    break;
                }
            }
            
            if(isLucky) {
                luckyNums.add(min);
            }
        }
        
        return luckyNums;
    }
}
