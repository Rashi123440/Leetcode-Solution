class Solution {
    public void recurse(int[] nums, boolean[] isVisited, List<List<Integer>> ans, List<Integer> current) {

        if (current.size() == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if(i>0 && nums[i] == nums[i-1] && !isVisited[i-1]){
                continue;
            }

            if (!isVisited[i]) {
                isVisited[i] = true;
                current.add(nums[i]);
                recurse(nums, isVisited, ans, current);
                isVisited[i]=false;
                current.remove(current.size() - 1);

            }
        }
    }
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        boolean[] isVisited = new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            isVisited[i]=false;
        }
        recurse(nums, isVisited, ans, new ArrayList<>());

        return ans;
    }
}