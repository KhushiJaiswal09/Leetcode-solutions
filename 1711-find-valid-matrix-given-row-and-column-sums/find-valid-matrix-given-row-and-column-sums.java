class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        
        int r=rowSum.length;
        int c=colSum.length;

        int[][] result=new int[r][c];

        for(int i=0; i<r; i++){

            for(int j=0; j<c; j++){

                result[i][j]=Math.min(rowSum[i], colSum[j]);

                if(result[i][j]==rowSum[i]){
                    colSum[j]=colSum[j]-rowSum[i];
                    rowSum[i]=0;
                }
                else{
                    rowSum[i]=rowSum[i]-colSum[j];
                    colSum[j]=0;
                }

            }

            //for (int k=0; k<n; k++){

            //}
        }


        return result;
    }
}