class Solution {
    public int[] searchRange(int[] nums, int target) {
         int ans[]=new int[2];
        ans[0]=FirstOcc(nums,target);
        ans[1]=LastOcc(nums,target);
        return ans;
    }
   private int FirstOcc(int nums[],int target)
    {
        int index=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=start+((end-start)/2);
           if(nums[mid]==target)
           {
               index=mid;
               end=mid-1;
           }
            else if(nums[mid]>=target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return index;
    }
   private int LastOcc(int nums[],int target)
    {
        int index=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=start+((end-start)/2);
           if(nums[mid]==target)
           {
               index=mid;
               start=mid+1;
           }
            else if(nums[mid]<=target)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return index;
    }
}