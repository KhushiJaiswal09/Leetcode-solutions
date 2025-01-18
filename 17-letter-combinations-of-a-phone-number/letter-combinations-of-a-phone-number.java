class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        HashMap<Character, String> map=board();
        if(digits.length()==0) return result;
        combinations(map, digits, 0, "", result);
        return result;
    }
    private void combinations(HashMap<Character, String> map, String digits, int i, String p, List<String> result){
        if(i==digits.length()){
            result.add(p);
            return;
        }
        for( char c : map.get(digits.charAt(i)).toCharArray() ){
            String s=new String(p);
            s+=c;
            combinations(map, digits, i+1, s, result);

        }
    
    }

    private HashMap<Character, String> board(){
        HashMap<Character, String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        return map;
    }
}
