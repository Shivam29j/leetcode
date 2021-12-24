class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
      List ans=new ArrayList<>();
Map<Integer,Integer> hm=new HashMap<>();
for(int i=0;i<nums1.length;i++)
{
hm.put(nums1[i],1);
}
for(int i=0;i<nums2.length;i++)
{
if(hm.containsKey(nums2[i]) && hm.get(nums2[i])==1 && ans.contains(nums2[i])==false)
ans.add(nums2[i]);
else
hm.put(nums2[i],2);
}
for(int i=0;i<nums3.length;i++)
{
if(hm.containsKey(nums3[i]) && ans.contains(nums3[i])==false)
ans.add(nums3[i]);
}
return ans;
  
    }
}