class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character, Integer> map=new HashMap<>();
        
        if(s.length()!=t.length()) return false;
        int n=s.length();

        for(int i=0; i<n; i++)
        {
            char c=t.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);  
        }
        

        for(int i=0; i<n; i++)
        {
            char c=s.charAt(i);
           

            if(map.containsKey(c) && map.get(c)>0){
                map.put(c, map.get(c)-1);
            }
            else{
                return false;
            }
        }
        


        return true;
    }
}