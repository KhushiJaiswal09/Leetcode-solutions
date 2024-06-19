class Solution {
    public boolean isSameAfterReversals(int num) {
        
             int n=0;
             int N=num;

        for(int i=0; num>0; i++){
            n=n*10+num%10;
            num=num/10;
        }

        int n1=0;
          for(int i=0; n>0; i++){
            n1=n1*10+n%10;
            n=n/10;
        }

        if(N==n1){
            return true;
        }else{
            return false;
        }

    }
}