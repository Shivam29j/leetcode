class Solution {
    public String firstPalindrome(String[] words) {
          int i,j;
        for(String s:words)
        {
            i=-1;
            j=s.length();
            while(++i<--j&&s.charAt(i)==s.charAt(j));
            if(i>=j)
                return s;
        }
        return "";
    }
}