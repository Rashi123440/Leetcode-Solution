class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] sufix =new int[nums.length];
        sufix [nums.length-1]= nums[nums.length-1];
        for(int i=nums.length-2; i>=0 ; i --){
            sufix[i]=Math.min(nums[i] ,sufix[i+1]);

        } 
        int prefix =nums[0];

        for(int i=0;i<nums.length;i++){
            prefix=Math.max(prefix,nums[i]);
            int result= prefix - sufix[i];
            if(result<=k){
                return i;
            }
        }
        return -1;
    }
}