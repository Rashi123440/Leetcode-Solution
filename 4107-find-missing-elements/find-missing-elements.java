class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> result=new ArrayList<>();
        for(int i=1;i<nums.length;i++){
            if(nums[i]- nums[i-1]>1){
               for(int j =nums[i-1]+1;j<nums[i];j++){
                result.add(j);
               }
            }
        }
        return result;
    }
}

  
         

