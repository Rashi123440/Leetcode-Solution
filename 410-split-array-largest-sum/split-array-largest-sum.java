class Solution {
    private int countsubarrays(int[]nums,int maxSum){
        int count=1;
        int sum=0;
        for(int num:nums){
            if(sum+num<=maxSum){
                sum+=num;
            }
            else{
                count++;
                sum=num;
            }
        }
        return count;
    }
        public int splitArray(int[] nums, int k) {
            int low=0;
            int high=0;
            for(int num:nums){
                low=Math.max(low,num);
                high+=num;
            }
            while(low<=high){
                int mid=(low+high)/2;
                int parts =countsubarrays(nums,mid);
                if(parts>k){
                    low=mid+1;
                }
                else{
                    high = mid-1;
                }
            }
            return low;
    }
}