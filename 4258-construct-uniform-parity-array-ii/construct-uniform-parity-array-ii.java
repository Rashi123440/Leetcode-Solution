class Solution  {
    public boolean uniformArray(int[] nums1){
        int odd = Integer.MAX_VALUE;
        for(int i=0 ;i<nums1.length;i++){
            if(nums1[i]%2==1){
                odd =Math.min(odd,nums1[i]);

            }
        }
        if(odd == Integer.MAX_VALUE){
            return true;

        }
    for(int i=0 ;i<nums1.length;i++){
        if(nums1[i]%2==0&& nums1[i] < odd){
            return false;
        }
    }
    return true;
}
}