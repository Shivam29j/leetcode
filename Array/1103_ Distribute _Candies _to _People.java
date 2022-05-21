class Solution {
    public int[] distributeCandies(int candies, int num_people) {
          int[] arr = new int[num_people];
      int currCandyCount = 1;
     while(candies > 0)
     {
            for(int i = 0; i<num_people; i++) 
            {
                if(candies >= currCandyCount) 
                { 
                    arr[i]+= currCandyCount;
                    candies -=currCandyCount;
                    currCandyCount++;
                } 
                else
                {
                    arr[i] += candies;
                    candies = 0;
                }
            }
        }
        return arr;    
    }
}