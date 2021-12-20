class Solution {
    public boolean isMonotonic(int[] nums) {
     boolean isMonoInc=false;
        if(nums[0]<nums[nums.length-1])
            isMonoInc=true;
        
        if(isMonoInc){
            for(int i=0;i<nums.length;i++){
                if(i+1<nums.length&&nums[i]>nums[i+1])
                    return false;
            }
        }
        else{
            for(int j=0;j<nums.length;j++){
            if(j+1<nums.length&&nums[j]<nums[j+1])
                return false;
            }
        }
        
        return true;
    }
}