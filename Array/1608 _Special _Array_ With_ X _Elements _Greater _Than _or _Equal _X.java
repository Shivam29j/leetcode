class Solution {
    public int specialArray(int[] nums) {
        int[] count = new int[1001];
        for (int num : nums) 
        {
            count[num]++;
        }
        int number = nums.length;
        for (int i = 0; i <= nums.length; i++)
        {
            if (number == i)
            {
                return i;
            }
            number -= count[i];
        }
        return -1; 
    }
}