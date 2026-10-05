class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer>  st=new Stack<>();
        st.push(0);
        for(char c :s.toCharArray()){
        if(c == '('){
            st.push(0);
        }
        else{
         int current = st.pop();
         if(current==0){
            current=1;
         }
         else{
            current = 2*current;
         }
         st.push(st.pop()+current);
        }
        }
        return st.peek();  
    }
}