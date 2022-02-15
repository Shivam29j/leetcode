class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] ans=new int[nums1.length];
            for(int i=0;i<nums1.length;i++){
                for(int j=0;j<nums2.length;j++){
                    if(nums1[i]==nums2[j]){
                        boolean bl=true;
                        for(int k=j+1;k<nums2.length;k++){
                            if(nums1[i]<nums2[k]){
                                bl=false;
                            ans[i]=nums2[k];
                            break;
                        }
                    }
                    if(bl) 
                        ans[i]=-1;
                    break;
                }
            }    
            
            }
            return ans;     
    }
}