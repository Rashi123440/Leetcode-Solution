class Solution {
    public String smallestPalindrome(String s) { 
        int []count = new int[26];
        for(char ch :s.toCharArray()){
            count[ch-'a']++;
        }
        StringBuilder left = new StringBuilder();
        char middle=0;
        for(int i=0;i<26;i++){
            for(int j=0;j<count[i]/2;j++){
                left.append((char)('a'+i));
            }
            if(count[i]%2 ==1){
                middle = (char)('a'+i);
            }
        }
        StringBuilder right = new StringBuilder(left).reverse();
        if(middle!=0){
            return left.toString()+middle+right.toString();
        }
        return left.toString()+right.toString();
        
    }
}