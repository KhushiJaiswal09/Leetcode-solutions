class Solution {
    public int compress(char[] chars) {

        StringBuilder s = new StringBuilder();

        int count=1;

        for(int i=1; i< chars.length; i++){
            
            if(chars[i-1]==chars[i]){
                count++;
            }
            else{
                s.append(chars[i-1]);
                if(count>1){
                    s.append(count); 
                }
                count = 1;  
            }
        }
        s.append(chars[chars.length-1]);

            if(count>1){
                s.append(count); 
            } 
            
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }       
       
     return s.length();   

    }
}