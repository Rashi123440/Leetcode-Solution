class Solution {
    public String frequencySort(String s) {
       int[] freq= new int[128];
       for (char ch :s.toCharArray()){
        freq[ch]++;
       }
       StringBuilder ans=new StringBuilder ();
       while(true){
        int maxfreq=0;
        int ch=-1;
        for(int i=0;i<128;i++){
            if (freq[i]>  maxfreq){
                 maxfreq = freq[i];
                ch=i;
            }
        }
        if(maxfreq ==0){
            break;
        }
        while(maxfreq-- >0){
            ans.append((char)ch);
        }
        freq[ch]=0;
       }
       return ans.toString();
    }
}