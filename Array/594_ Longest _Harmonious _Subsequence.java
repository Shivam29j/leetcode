class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int num : nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int ans=0;
        for(Map.Entry<Integer,Integer>m : map.entrySet())
        {
            if(map.containsKey(m.getKey()+1)) 
            {
                ans=Math.max(ans,m.getValue()+map.get(m.getKey()+1));
            }
        }
        return ans;  
    }
}