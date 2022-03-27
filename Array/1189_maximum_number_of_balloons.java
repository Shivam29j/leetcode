class Solution {
    public int maxNumberOfBalloons(String text) {
       char [] chars = text.toCharArray();
        double [] result = new double[5];

        for(int i = 0; i < chars.length; i++)
        {
            if(chars[i] == 'b')
            {
                result[0] += 1;
            }
            else if(chars[i] == 'a')
            {
                result[1] += 1;
            }
            else if(chars[i] == 'l')
            {
                result[2] += .5;
            }
            else if(chars[i] == 'o')
            {
                result[3] += .5;
            }
            else if(chars[i] == 'n')
            {
                result[4] += 1;
            }
        }

        Arrays.sort(result);

        return (int)result[0];
    }
} 