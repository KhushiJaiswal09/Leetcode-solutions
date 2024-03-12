class Solution {
    public int maximumWealth(int[][] accounts) {
            int i=0;
            int max=0;

            for(i=0; i<accounts.length; i++){
                int sum = 0;

                for(int j=0; j<accounts[i].length; j++){
                    int num=  accounts[i][j];

                    sum= sum+num;

                }

               // max= arr[accounts.length];

                if (sum > max) {
                    max= sum;
                }
            }

            return max;

    }
}