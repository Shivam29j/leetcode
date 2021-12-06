class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int answer=0,temp1=0,temp2=0;
        for( int i=0;i<nums.length;i++)
        {
            temp1=nums[nums.length-2]*nums[nums.length-1];
            temp2=nums[0]*nums[1];
            answer=temp1-temp2;
        }
        return answer;
    }
}