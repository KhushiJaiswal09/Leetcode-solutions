class Solution {
    public int subtractProductAndSum(int n) {
        int length = String.valueOf(n).length();
        int sum=0;
        int product=1;
        for(int i=0; i<length; i++){


            int a=n%10;
            int b=n/10;
            sum= sum + a;
            product =product * a;
            n=b;
        }

       int r= product-sum;
       // System.out.println(r);
       return  r;
    }
}