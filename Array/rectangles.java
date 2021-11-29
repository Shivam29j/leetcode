class Solution {
    public int countGoodRectangles(int[][] rectangles) {
          int maxLen =0;
        int count=0;
        for(int [] r : rectangles){
            int l = r[0]<r[1]?r[0]:r[1];
            
          if(maxLen < l){
              maxLen=l;
              count=1;
          }
         else if(maxLen==l){
            count++;
          }   
        }
        return count;
    }
}
         