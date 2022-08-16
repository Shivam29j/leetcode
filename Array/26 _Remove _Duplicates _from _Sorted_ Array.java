class Solution {
    public int removeDuplicates(int[] nums) {
        int pos=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[pos++]=nums[i+1];
            }
        }
        return pos;
    }
}