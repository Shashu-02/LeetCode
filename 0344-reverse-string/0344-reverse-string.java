class Solution {
    public void reverseString(char[] s) {
        int left=0;
        for(int right=s.length-1;right>=0;right--){
            if(left>right){
                break;
            }
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
        }
    }
}