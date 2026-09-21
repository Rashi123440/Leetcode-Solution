class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<> ();
        for( char c :num.toCharArray()){
            while(!st.isEmpty() && k>0 && st.peek()>c){
                st.pop();
                k--;
            }
            st.push(c);
        }
        while(k>0){
            st.pop();
            k--;
        }
        String ans="";
        while(!st.isEmpty()){
            ans = st.pop()+ans;

        }
        int i=0;
        while(i<ans.length() && ans.charAt(i)=='0'){
            i++;
        }
        ans = ans.substring(i);
        if(ans.equals("")){
            return "0";
        }
        return ans;
    }
}

        
