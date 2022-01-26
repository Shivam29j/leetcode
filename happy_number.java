class Solution {
    public boolean isHappy(int n) {
      int slow = n,fast = n;
        do{
            slow = solve(slow);
            fast = solve(fast);
            fast = solve(fast);
            if(slow == 1) return true;
        }while(slow != fast);

        return false;
    }
   public int solve(int n)
    {
        int sum=0,rem=0;
        while(n>0)
        {
            rem=n%10;
            sum=sum+(rem*rem);
            n=n/10;
        }
        return sum;   
    }
}