class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        int n=image[0].length;

        int[][] img= new int[image.length][image[0].length];

        for(int i=0; i<img.length; i++){

            for(int j=0; j<n; j++){
                img[i][j]=  image[i][n-j-1];
            }
        }

               for(int i=0; i<img.length; i++){

            for(int j=0; j<n; j++){
                if(img[i][j]==0){
                    img[i][j]=1;
                }else{
                    img[i][j]=0;
                }
            }
        }
        
return img;
    }
}