class Solution {
    public String reverseVowels(String s) {
        
        StringBuilder str = new StringBuilder(s);
        ArrayList<Integer> arr= new ArrayList<>();
        int y=0;

        while(y < s.length()){
            char c=s.charAt(y);
            if( c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || 
                c=='A' || c=='E' || c=='I' || c=='O' || c=='U' ){

                    arr.add(y);
                }
                y++;
        }

        int n= arr.size();
        for(int x=0; x<n/2; x++){

            char temp= str.charAt(arr.get(x));
            str.setCharAt(arr.get(x), s.charAt(arr.get(n-x-1)));
            str.setCharAt(arr.get(n-x-1), temp);
        }

return str.toString();
    }
}