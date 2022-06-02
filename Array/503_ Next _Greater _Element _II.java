class Solution {
    public int[] nextGreaterElements(int[] nums) {
         int n=(nums.length);
    int[] res= new int[n];
    for(int i=n-1;i>=0;i--)
    {
        for(int j=(i+1)%n;j<n;j=(j+1)%n)
        {
            if(nums[j]>nums[i])
            {
                res[i]=nums[j];
                break;
            }
            if((j+1==i && nums[j]<nums[i]) || j==i)
            {
                res[i]=-1;
                break;
            }
        }
    }
    return res;  
    }
}