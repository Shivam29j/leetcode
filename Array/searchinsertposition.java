class Solution {
    public int searchInsert(int[] nums, int target) {
          if (nums.length == 0) return 0;
        
        int a = 0;
        while (a < nums.length) {
            if (target <= nums[a]) {
                return a;
            } else {
                a++;
            }
        }
        return a;
    }

    }
