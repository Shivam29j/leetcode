class Solution {
    public int minPairSum(int[] nums) {
          Arrays.sort(nums);
        int ans[]=new int[nums.length];
        int j=nums.length-1;
    for(int i=0;i<=nums.length/2;i++) 
    {
        ans[i]=nums[i]+nums[j];
        j--;
    }
        Arrays.sort(ans);
        return ans[ans.length-1]; 
    }
}