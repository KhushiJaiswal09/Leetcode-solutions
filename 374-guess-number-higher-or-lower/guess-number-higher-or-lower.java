public class Solution extends GuessGame {
    public int guessNumber(int n) {
        long low=1,high=n;
        while(low<=high){
            long mid=(low+high)/2;
            if(guess((int)mid)==0)
                return (int)mid;
            else if(guess((int)mid)==1){
                low=(int)mid+1;
            }
            else{
                high=(int)mid-1;
            }
        }
        return -1;
    }
}