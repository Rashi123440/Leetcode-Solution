class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] ans = new int[nums1.length];
        for(int i=0 ;i<ans.length ;i++){
            ans[i]=-1;
        }
            Stack<Integer > stack = new Stack<>();
            for(int i=0;i<nums2.length;i++){
                while(!stack.isEmpty() && stack.peek()< nums2[i]){
                    int value =stack.pop();
                    for(int j=0;j<nums1.length;j++){
                        if(nums1[j]==value){
                            ans[j]=nums2[i];
                            break;
                        }
                    }

                }
                stack.push(nums2[i]);
            }
            return ans;
           
    }
}