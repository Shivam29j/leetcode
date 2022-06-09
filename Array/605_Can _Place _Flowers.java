class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
         int index = 0;
        int count = 0;
        while (index < flowerbed.length)
        {
            if (flowerbed[index] == 1)
            {
                index += 2;
            }
            else if (index < flowerbed.length - 1 && flowerbed[index + 1] == 1) 
            {
                index += 3;
            }
            else
            {
                count ++;
                index +=2;
            }
        }

        return count >= n;   
    }
}