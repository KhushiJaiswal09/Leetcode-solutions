class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
       if(n==0){
        n=1;
       }

        if(n%2==0){
            return isPowerOfTwo(n/2);
        }
        else{
            return false;
        }



    }
}