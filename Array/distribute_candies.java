class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length,i=0,j=0,x=0;
        
        Arrays.sort(candyType);
        
        while (i<n-1 && j<n/2)
        {
            if (candyType[i]!=candyType[i+1])
            {
                ++j;
                x=candyType[i];
            }
            ++i;
        }
        
        return j<n/2 && x!=candyType[n-1] || j==0 ? ++j : j; 
    }
}