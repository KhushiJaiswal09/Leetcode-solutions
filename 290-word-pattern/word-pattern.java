class Solution {
    public boolean wordPattern(String pattern, String s) {

        HashMap<Character, String> map=new HashMap<>(); 
        String[] str=s.split("\\s+");
        if(pattern.length() != str.length) return false;
        for(int i=0; i<str.length; i++){
            
            String val= map.get(pattern.charAt(i));
            if(map.containsKey(pattern.charAt(i))){
                if(!val.equals(str[i])){
                    return false;
                }
            }
            else{
                if(map.containsValue(str[i])){
                    return false;
                }
                else{
                    map.put(pattern.charAt(i), str[i]);
                }
            }
        }
         
        return true;  
    }
} 