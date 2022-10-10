class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int largest=0;
        List<Boolean> list=new ArrayList<Boolean>();
        for (int candy : candies) {
            if (candy > largest) {
                largest = candy;
            }
        }
        //turn all elements of list  to false
        for(int i=0;i<candies.length;i++)
        {
           list.add(i,false);
        }

        //now check if the candies[i]+ extra candies is >maximum element
        //
        for(int i=0;i<candies.length;i++)
        {
            if((candies[i])+extraCandies>=largest)
            {
                list.set(i,true);
            }
            else
            {
                list.set(i,false);
            }
        }
        return list; 
    }
}