class Solution {
    void solve(int[]candidates , int target,int start, List<List<Integer>>result,List<Integer>current){
        if(target==0){
              result.add(new ArrayList<>(current));
              return;
        }
        if(target<0){
            return;
        }
        for(int i=start ; i<candidates.length;i++){
            if(i>start && candidates[i]== candidates[i-1]){
                continue;
            }
        current.add(candidates[i]);
        solve(candidates,target-candidates[i],i+1,result,current);
        current.remove(current.size()-1);
        }

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates,target,0,result,current);
        return result;
        
    }
}