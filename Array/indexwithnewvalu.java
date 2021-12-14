class Solution {
    public int smallestEqual(int[] nums) {
      int i,value=-1;
        for(i=0;i<nums.length;i++)
        {
            if(i%10==nums[i])
            {
                value=i;
                break;
            }           
        }
        return value;        
    }   
    }
