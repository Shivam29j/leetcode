class Solution {
    public int[] sortArrayByParityII(int[] nums) {
         int res[]= new int[nums.length];
        int j=0;
        int k=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
               res[j]=nums[i];
                j=j+2;
            }
            else{
                res[k]=nums[i];
                k=k+2;
            }
        }
        return res;
    }
}