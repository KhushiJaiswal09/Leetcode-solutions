class Solution {
    public int numberOfSteps(int num) {
        
    int count=0;
    
     if (num==0) {
            return 0;
        }
    
      num= (num%2==0)? (num/2):(num-1);
      count= (num%2==0)? 1:1;
      return count + numberOfSteps(num);
    }
}