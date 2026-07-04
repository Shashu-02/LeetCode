class Solution {
    public boolean isSubsequence(String s, String t) {
        int left=0;
        int right=0;
        while(left<s.length()&&right<t.length()){
            char a = s.charAt(left);
            char b=t.charAt(right);
            if(a==b){
                right++;
                left++;
            }
            else{
                right++;
            }
        }
        return left==s.length();
    }
}