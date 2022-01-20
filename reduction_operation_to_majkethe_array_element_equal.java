class Solution {
    public int reductionOperations(int[] nums) {
         Arrays.sort(nums);
       int sum =0;
        
        for(int i=0; i<nums.length -1; i++){
            if(nums[i] == nums[i+1]){
                continue;
            }
            else{
               
            sum += (nums.length - i -1);
            }
        }
         return sum; 
    }
}