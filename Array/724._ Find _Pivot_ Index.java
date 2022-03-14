class Solution {
    public int pivotIndex(int[] nums) {
     int prefixSum[]=new int[nums.length];
       int postfixSum[]=new int[nums.length];
        prefixSum[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            prefixSum[i]=prefixSum[i-1]+nums[i];
        }
        postfixSum[postfixSum.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--)
        {
            postfixSum[i]=postfixSum[i+1]+nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(postfixSum[i]==prefixSum[i])
            {
                return i;
            }
        }  
        return -1;   
    }
}