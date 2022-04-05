class Solution {
    public int[] sortEvenOdd(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                 if((i%2==0 && j%2==0) && nums[i]>nums[j]){
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                    
                 }else if((i%2!=0 && j%2!=0) && nums[i]<nums[j]){
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                 }
            }
        }
                    
                
        return nums;
            
        
    }
}