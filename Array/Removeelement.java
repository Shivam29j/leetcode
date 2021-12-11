class Solution {
    public int removeElement(int[] nums, int val) {
         if(nums.length == 0)
            return 0;
        int occ = 0;
        while(nums.length-1-occ >= 0 && nums[nums.length-1-occ] == val )
            occ++;
        for(int i=0; i<nums.length - occ; i++){
            if(nums[i] == val)
                nums[i] = nums[nums.length-1-occ++];
        while(nums.length-1-occ >= 0 && nums[nums.length-1-occ] == val )
                occ++;
        }
        return nums.length - occ;
    
    }
}