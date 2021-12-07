class Solution {
    public int xorOperation(int n, int start) {
       if(n==0)
            return 0;
        if(n==1)
            return start;
        int i =1;
        int first = start;
        int result = start;
        while(i<n){
            
            result = first^(start+2*i);
            first = result;
            i++;
        }
        return result;  
    }
}