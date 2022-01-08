class Solution {
    public int climbStairs(int n) {
        int temp = 0,next = 1,prev = 0;
        for(int i=0;i<=n;i++){
            temp = next + prev;
            next = prev;
            prev = temp;
        }
        return temp; 
    }
}