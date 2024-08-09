class Solution {
    public int maxArea(int[] height) {
        int max=0, i=0;
        int j=height.length-1;
 
        
            while( i<j){
              
                int ans=(Math.min(height[i], height[j]))*(j-i);     
                max=Math.max(max, ans);


                if(height[i]< height[j]){
                    i++;
                }else{
                    j--;
                }
            }
        
        return max;
    }
}