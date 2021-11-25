class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int maxCandy = candies[0];
        List<Boolean> greatestCandy = new ArrayList<Boolean>();
        
        
        for(int i = 1; i < candies.length; i++){
            
            if(candies[i] > maxCandy){
                maxCandy = candies[i];
            }
            
        }
        
        
        for(int i = 0; i < candies.length; i++){
            
            if(candies[i] + extraCandies >= maxCandy){
                greatestCandy.add(true);
            }else{
                greatestCandy.add(false);
            }
        }
        
        return greatestCandy;
        
    }
}