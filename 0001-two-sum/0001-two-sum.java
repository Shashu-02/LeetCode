class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int pre=target-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(pre-nums[j]==0){
                    hs.add(i);
                    hs.add(j);
                }
            }
        }
        int arr[]=new int[hs.size()];
        int i=0;
        for(int x:hs){
            arr[i]=x;
            i++;
        }
        return arr;   
    }
}