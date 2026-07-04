class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res="";
        int i=0;
        int j=0;
        while(i<word1.length()&&j<word2.length()){
            res=res+word1.charAt(i);
            i++;
            res=res+word2.charAt(j);
            j++;
        }
        while(i<word1.length()){
            res=res+word1.charAt(i);
            i++;
        }
        while(j<word2.length()){
            res=res+word2.charAt(j);
            j++;
        }
        return res;
    }
}