class Solution {
    public int findPairs(int[] nums, int k) {
        int ans= 0;
    Arrays.sort(nums);
   for(int i=0;i<nums.length;i++)
   {
     if(i==0 || (i>0 && nums[i]!=nums[i-1]))
     {    
        for(int j=0;j<nums.length;j++)
        {
            if(i!=j && nums[j]-nums[i]==k)
            {
               ans+=1;
               break;   
            }   
        }
     }
  }
        return ans; 
    }
}