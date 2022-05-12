class Solution {
    public int countPrimeSetBits(int left, int right) {
         int count = 0;
        for (int i = left; i <= right; i++) 
            if (isPrime(getCount(i)))
                count++;
        return count;
    }
    static int getCount(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n -= n & (-n);
        }
        return count;
    }
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0)
                return false;
            c++;
        }
        return true;
    }
}