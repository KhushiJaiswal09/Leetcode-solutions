class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        int sum=0;

        while(!set.contains(n) && sum!=1 ){
            
            sum=0;
            set.add(n);

            while(n!=0){
                
                sum +=((n%10)*(n%10));
                n=n/10;                                                                                        
            }

            n=sum;
        }


        return sum==1;    
    }
}