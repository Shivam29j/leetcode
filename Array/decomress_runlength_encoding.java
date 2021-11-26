class Solution {
    public int[] decompressRLElist(int[] nums) {
         int size = 0;
        int i = 0;
        while (i < nums.length) {
            size += nums[i];
            i += 2;
        }
        int[] result = new int[size];
        i = 0;
        int index = 0;
        while (i < nums.length) {
            for (int j = 0; j < nums[i]; j++) {
                result[index++] = nums[i + 1];
            }
            i += 2;
        }
        return result;
    
        
    }
}