class Solution {
    public int maximalRectangle(char[][] matrix) {
        int row =matrix.length;
        int col=matrix[0].length;
        int [] height= new int[col];
        int maxarea=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]=='1'){
                    height[j]++;

                }
                else{
                    height[j]=0;
                }
            }
            for (int j=0 ; j<height.length;j++){
        while(!st.isEmpty() && height[st.peek()]>height[j]){
           int k = st.pop();
           int width = j - (st.isEmpty() ? -1 : st.peek())-1;
           int area = height[k]*width;
           maxarea=Math.max(maxarea,area);
        }
        st.push(j);
        }
        while(!st.isEmpty()){
            int k=st.pop();
            int width = height.length-(st.isEmpty() ? -1:st.peek())-1;
            int area = height[k]*width;

            maxarea=Math.max(maxarea,area);
        }
        }
        return maxarea;
        
    }
}
        
