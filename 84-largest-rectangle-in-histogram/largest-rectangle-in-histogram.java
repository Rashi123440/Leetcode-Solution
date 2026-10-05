class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int maxarea=0;
        for(int i=0;i<heights.length;i++){
        while(!st.isEmpty() && heights[st.peek()]>heights[i]){
           int j = st.pop();
           int width = i - (st.isEmpty() ? -1 : st.peek())-1;
           int area = heights[j]*width;
           maxarea=Math.max(maxarea,area);
        }
        st.push(i);
        }
        while(!st.isEmpty()){
            int j=st.pop();
            int width = heights.length-(st.isEmpty() ? -1:st.peek())-1;
            int area = heights[j]*width;

            maxarea=Math.max(maxarea,area);
        }
        return maxarea;
        
    }
}