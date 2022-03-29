class Solution {
    public int mostFrequent(int[] nums, int key) {
        int max=Integer.MIN_VALUE;
int res=0;
HashMap<Integer,Integer> map=new HashMap<>();
for(int i=0;i<=nums.length-2;i++){
if(nums[i]==key){
if(!map.containsKey(nums[i+1])) map.put(nums[i+1],1);
else map.put(nums[i+1],map.get(nums[i+1])+1);
if(map.get(nums[i+1])>max){
max=map.get(nums[i+1]);
res=nums[i+1];
}
}
}
return res;
    }
}