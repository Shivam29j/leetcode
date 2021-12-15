class Solution {
    public int[] plusOne(int[] digits) {
       int n=digits.length;
        int i=0;
        while(i<n && ++digits[n-1-i]%10==0 ){
            digits[n-1-i]%=10;
            i++;
        }
        if(digits[0]==0){
            digits = new int[n+1];
            digits[0]=1;
        }
        return digits;
    } 
    }
