class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> ms=new HashMap<>();
        HashMap<Character,Integer> mt=new HashMap<>();
        for(char x:s.toCharArray()){
            ms.put(x,ms.getOrDefault(x,0)+1);
        }
        for(char x:t.toCharArray()){
            mt.put(x,mt.getOrDefault(x,0)+1);
        }
        return ms.equals(mt);     
    }
}