class Solution {
    public boolean isSubsequence(String s, String t) {

        int n = t.length();
        int m = s.length();
        int i = 0, j = 0;

        if (m == 0 && n == 0) return true;
        
        else if (n == 0) return false;
        
        else if (m == 0 ) return true;
        

        while (i < n) {

            if (s.charAt(j) == t.charAt(i)) j++;
            
            if (j == m) return true;

            i++;
        }
        return false;
    }
}