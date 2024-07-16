class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    private List<Integer> path = new ArrayList<>();
    private int k;

    public List<List<Integer>> combinationSum3(int k, int n) {
        this.k = k;
        dfs(9, n); // select from 1-9
        return this.ans;
    }

    public void dfs(int i, int t){ // t is the remaining sum
        int d = k-path.size(); 
        if(t < 0 || t > (i+i-d+1)*d/2){ // sum of i, i-1,... i-d
            return;
        }
        if(d == 0){ // at this time t must == 0
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int j = i; j >= d; --j){
            path.add(j);
            dfs(j-1, t-j);
            path.remove(path.size()-1);
        }
    }
}