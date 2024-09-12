class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character, Integer> map1=new HashMap<>();
        HashMap<Character, Integer> map2=new HashMap<>();

        if(s.length()!=t.length()) return false;
        int n=s.length();

        for(int i=0; i<n; i++)
        {
            char c=t.charAt(i);
            map1.put(c, map1.getOrDefault(c, 0)+1);  
        }
        for(int i=0; i<n; i++)
        {
            char c=t.charAt(i);
            map2.put(c, map2.getOrDefault(c, 0)+1);
        }

        for(int i=0; i<n; i++)
        {
            char c1=s.charAt(i);
            char c2=t.charAt(i);

            if(map1.containsKey(c1) && map1.get(c1)>0){
                map1.put(c1, map1.get(c1)-1);
            }
            else{
                return false;
            }
        }
        


        return true;
    }
}