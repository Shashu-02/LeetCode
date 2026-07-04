class Solution {
    public boolean isPalindrome(String s) {
        String r=s.replaceAll("[^a-zA-Z0-9]", "");
        String res=r.toLowerCase();
        int right=res.length()-1;
        int left=0;
        System.out.println(res);
        while(left<right){
            char a=res.charAt(left);
            char b=res.charAt(right);
            if(a!=b){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
}