class Solution {
    public int reverse(int x) {
        int rem = 0; 
        long sum = 0;
        while(x != 0)
        {
            rem = x % 10;
            sum = (sum*10) + rem;
            x = x/10;
        }
        if(sum > ((int)Math.pow(2, 31)-1) || sum < ((-1) * (int)Math.pow(2, 31)))
        {
            return 0;
        }
        return (int)sum;
        
    }
}