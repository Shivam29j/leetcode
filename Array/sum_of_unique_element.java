class Solution {
    public int sumOfUnique(int[] nums) {
        int [] dp = new int[101];
        for(int i=0;i<nums.length;i++){
            dp[nums[i]]++;
        }
        int sum  = 0;
        for(int i = 0; i < dp.length; i++) {
            if(dp[i] == 1) {
                sum += i;
            }
        }
        return sum;
    }
}