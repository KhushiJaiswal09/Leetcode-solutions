class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen=new HashSet<>();
        int sum = 0, a = 0;

        while (!seen.contains(n) &&  sum!=1) {
            sum=0;
            seen.add(n);
            while(n!=0)
            {
            a = n % 10;
            sum = sum +( a * a);
            n = n / 10;
            }
            n=sum;
        }
        
        return sum==1;           
        
    }
}