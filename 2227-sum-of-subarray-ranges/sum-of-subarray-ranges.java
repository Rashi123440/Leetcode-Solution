class Solution {
    public long minsub(int[] nums){
        Stack<Integer> st = new Stack<>();
        long sum =0;
         for (int i=0 ; i<=nums.length ; i++){
            while (!st.isEmpty() &&  (i==nums.length|| nums[st.peek()] > nums[i])) {
            int j = st.pop();
            int left = st.isEmpty()? -1:st.peek();
            long count =(long) (j-left)*(i-j);
            sum+=(long) nums[j]*count;
            }
            if(i<nums.length){
                st.push(i);
            }
         } 
         return sum;
    }
    public long maxsum(int[] nums){
        Stack<Integer>st = new Stack<>();
        long sum =0;
        for (int i=0 ; i<=nums.length ; i++){
            while (!st.isEmpty() &&  (i==nums.length|| nums[st.peek()] <nums[i])) {
            int j = st.pop();
            int left = st.isEmpty()? -1:st.peek();
            long count =(long) (j-left)*(i-j);
            sum+=(long) nums[j]*count;
            }
            if(i<nums.length){
                st.push(i);
            }
         } 
         return sum;
    }


    public long subArrayRanges(int[] nums) {
        return maxsum(nums)-minsub(nums);
    }

}