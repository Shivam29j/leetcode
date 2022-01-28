class Solution {
    public boolean judgeSquareSum(int c) {
         int left=0,right=(int)Math.sqrt(c);
        while(left<=right)
        {
           int s=(left*left)+(right*right);
            if(s<0)
            {
                right--;
            }
            if(s==c)
            {
                return true;
            }
             if(s<c)
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return false;
    }
}