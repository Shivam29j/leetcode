class Solution {
    public String mergeAlternately(String word1, String word2) {
         char c1[]=word1.toCharArray();
        char c2[]=word2.toCharArray();
        StringBuilder sb=new StringBuilder();
        int i=0,j=0;
        while(i<c1.length && j<c2.length)
        {
            sb.append(c1[i++]);
            sb.append(c2[j++]);
        }
        while(i<c1.length)
        {
            sb.append(c1[i++]);
        }
        while(j<c2.length)
        {
            sb.append(c2[j++]);
        }
        return sb.toString();
    }
}