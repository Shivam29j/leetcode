class Solution {
    public boolean canJump(int[] nums) {
        int far = 0;
        for(int i=0;i<nums.length;i++){
            if(far<i){
                return false;
            }
            far=Math.max(far,nums[i]+i);
        }
        return true;
    }
}