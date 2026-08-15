class Solution {
    public int longestSubsequence(int[] nums) {
        int XOR=0;
        boolean nonZero=false;
        for(int i = 0; i < nums.length; i++){
            XOR= XOR^nums[i];
            if(nums[i]!=0){
                nonZero= true;
            }
        }
        if(XOR!=0){
            return nums.length;
        }
        if(nonZero){
            return nums.length-1; 
        }
        return 0;
        
    }
}