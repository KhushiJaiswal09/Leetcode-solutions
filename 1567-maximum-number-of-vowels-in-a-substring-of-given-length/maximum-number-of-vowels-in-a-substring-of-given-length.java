class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        int max=0;
    
        
        for(int i=0; i<s.length(); i++){

            if(i>=k){
             if(s.charAt(i-k)=='a' || s.charAt(i-k)=='e' || s.charAt(i-k)=='i' || s.charAt(i-k)=='o' || s.charAt(i-k)=='u' ||
                s.charAt(i-k)=='A' || s.charAt(i-k)=='E' || s.charAt(i-k)=='I' || s.charAt(i-k)=='O' || s.charAt(i-k)=='U'){
                    count=count-1;
               }               
            }

            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ||
               s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
                count++;
                    }
          

             max=Math.max(max, count);
          
        }

        return max;
    }
}