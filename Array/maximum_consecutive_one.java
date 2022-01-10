class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int result = 0;
        int counter = 0;
        for (int num : nums) {
            if (num == 0) {
                result = Math.max(result, counter);
                counter = 0;
            } else {
                counter++;
            }
        }
        return Math.max(result, counter);   
    }
}