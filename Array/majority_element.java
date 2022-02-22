class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
if(nums[0] == nums[nums.length/2]){
    return nums[nums.length/2];
}
else if(nums[nums.length-1]==nums[nums.length/2]) 
{
    return nums[nums.length/2];
}
     return nums[nums.length/2];   
    }
}