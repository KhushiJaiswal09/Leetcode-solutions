class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        String str= "";

        int n=Math.max(word1.length(), word2.length());
        int m=Math.min(word1.length(), word2.length());

        for(int i=0; i<m; i++){

           
                str= str + word1.charAt(i);
                
                str= str + word2.charAt(i);
            
        }
        int x=0;
        if(word1.length()>word2.length()){
            
          for(int i=0; i<n-m; i++){
                str= str + word1.charAt(i+m);
        }   
        }
        else{
          for(int i=0; i<n-m; i++){
                str= str + word2.charAt(i+m);
        }  
        }

        return str;
    }
}