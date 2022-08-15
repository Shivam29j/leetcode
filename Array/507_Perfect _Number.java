class Solution {
    public boolean checkPerfectNumber(int num) {
       if(num==1)
           return false;
        int s=1;
        for(int i=2;i<Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                s+=i;
                s+=num/i;
            }
        }
        return s==num; 
    }
}