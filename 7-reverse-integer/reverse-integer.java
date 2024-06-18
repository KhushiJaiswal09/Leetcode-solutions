class Solution {
    public int reverse(int x) {

        int y=0;
        long ans=0;

       

         while(x != 0){
            y=(x%10);
            ans=ans*10 + y;
            x=x/10;
        }

        return (ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) ? 0 : (int) ans;

    }
}