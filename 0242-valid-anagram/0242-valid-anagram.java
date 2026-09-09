class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> ms=new HashMap<>();
        for(char x:s.toCharArray()){
            ms.put(x,ms.getOrDefault(x,0)+1);
        }
        for(char x:t.toCharArray()){
            if(ms.containsKey(x)){
                ms.put(x,ms.get(x)-1);
            }else{
                return false;
            }
            if(ms.get(x)==0){
                ms.remove(x);
            }
        }
        if(ms.isEmpty()) return true;
        return false;
    }
}