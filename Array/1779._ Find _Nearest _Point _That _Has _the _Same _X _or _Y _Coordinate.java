class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
         int index = -1;
        int distance = -1;
        
        int tempDistance;

        for (int i = 0; i < points.length; i++) {
            if (points[i][0] == x) {
                tempDistance = Math.abs(points[i][1] - y);
            } else if (points[i][1] == y) {
                tempDistance = Math.abs(points[i][0] - x);
            } else continue;

            if (tempDistance == 0) return i;

            if (index == -1) {
                index = i;
                distance = tempDistance;
            } else if (tempDistance < distance) {
                index = i;
                distance = tempDistance;
            }
        }

        return index;
    }
}