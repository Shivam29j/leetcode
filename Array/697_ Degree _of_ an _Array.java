class Solution {
    public int findShortestSubArray(int[] nums) {
       HashMap<Integer,Integer> count = new HashMap<>(),left = new HashMap<>(),right = new HashMap<>();
        int j = 0;
        for(int num:nums)
        {
            if(left.get(num)==null)
                left.put(num,j);
            right.put(num,j);
            count.put(num,count.getOrDefault(num,0)+1);
            j++;
        }
        int min=Integer.MAX_VALUE;
        int degree = Collections.max(count.values());
        for(int num:count.keySet())
        {
            if(count.get(num)==degree)
                min = Math.min(min,right.get(num)-left.get(num)+1);
        }
        return min;   
    }
}