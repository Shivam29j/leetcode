class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int sum=0,count=0;
        for(int i=0;i<costs.length;i++)
        {
            sum+=costs[i];
            count++;
           if(sum==coins)
               return count;
            if(sum>coins)
                return count-1;
        }
        return count;
    }
}