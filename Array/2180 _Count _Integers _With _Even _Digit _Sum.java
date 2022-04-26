class Solution {
    public int countEven(int num) {
      int n=num,sum=0;
      while(n!=0) 
        {
        sum+=n%10;
        n/=10;
        }
        if((sum & 1)==0) return num/2;
        return (num-1)/2;
    }
}