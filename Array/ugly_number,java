class Solution {
    public boolean isUgly(int n) {
        if(n<1)
            return false;
        int arr[]={2,3,5};
        for(int i : arr){
            while(n%i==0)
            {
                n=n/i;
            }
        }
        if(n!=1)
            return false;
 
        return true; 
    }
}