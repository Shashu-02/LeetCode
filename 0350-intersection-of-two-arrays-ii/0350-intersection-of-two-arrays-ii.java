class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> ls=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();
        for(int x:nums1) ls.add(x);
        for(int x:nums2){
            if(ls.contains(x)){
                res.add(x);
                ls.remove(Integer.valueOf(x));
            }
        }   
        int arr[]=new int[res.size()];
        int i=0;
        for(int x:res){
            arr[i]=x;
            i++;
        }
        return arr;
    }
}