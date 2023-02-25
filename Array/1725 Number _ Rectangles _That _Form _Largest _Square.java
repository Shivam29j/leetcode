class Solution {
    public int countGoodRectangles(int[][] rectangles) {
    int largest = 0;
    int count = 0;
    for (int[] rectangle : rectangles) {
        int minSide = Math.min(rectangle[0], rectangle[1]);
        if (minSide > largest) {
            largest = minSide;
            count = 1;
        } else if (minSide == largest) {
            count++;
        }
    }
    return count;
    }
}