class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        var list = new ArrayList<Integer>();
    for (int i=0; i<nums.length; i++) {
        int index = Math.abs(nums[i])-1;
        if (nums[index] < 0) {
            list.add(Math.abs(nums[i]));
        } else {
            nums[index] *= -1;
        }
    }
    return list;
    }
}