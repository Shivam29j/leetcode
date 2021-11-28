class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int counter = 0;
        
        int x, y = 0;
      for (int i = 1;i < points.length; i++) {
            x = Math.abs(points[i][0] - points[i - 1][0]);
            y = Math.abs(points[i][1] - points[i - 1][1]);
          counter += Math.max(x, y);
      }
        return counter;
        
    }
}