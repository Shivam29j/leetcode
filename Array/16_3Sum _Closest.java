class Solution {
    public int threeSumClosest(int[] nums, int target) {
         Arrays.sort(nums);
        int ans = 0;
        int sum = 0;
        int diff = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length-2; i++){
                int lo = i + 1;
                int hi = nums.length-1;
                while(lo < hi){
                      sum = nums[i] + nums[lo] + nums[hi];
                    
                     if(Math.abs(sum - target) < diff){
                      diff = Math.abs(sum - target);
                        ans = sum;
                    }
                     if(sum > target){
                        hi--;
                }
                    else {
                      lo++;
                    }
                }
          }
        return ans;
    }
}