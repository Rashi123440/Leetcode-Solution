class Solution {
    public int minInsertions(String s) {
        int o =0;
        int result= 0;
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)=='('){
                o++;
            }
            else{
                if(i+1 <s.length() && s.charAt(i+1)== ')'){
                i++;
                }
                else {
                result++;
                }
                if(o >0){
                o -- ;
                }
                else{
                result ++;
                }
            }
        } 
        return result +o *2;
    }
}
    