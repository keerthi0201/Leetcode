class Solution {
    public int findDuplicate(int[] nums) {
        HashSet <Integer> hs = new HashSet<>();  
        int len = nums.length; 
        int result = 0;
        for(int i = 0;i<len;i++){
            if(hs.contains(nums[i])){
                result = nums[i];
            }else{
                hs.add(nums[i]);
            }
        }   
        return result;  
    }
}