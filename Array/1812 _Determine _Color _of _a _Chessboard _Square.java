class Solution {
    public boolean squareIsWhite(String coordinates) {
          int xCoordinate = coordinates.charAt(0) - 'a' + 1; 
        int yCoordinate = coordinates.charAt(1);
        return (xCoordinate + yCoordinate) % 2 != 0; 
    }
}