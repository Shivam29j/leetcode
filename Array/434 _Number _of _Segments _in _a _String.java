class Solution {
    public int countSegments(String s) {
         int count=0;
        s=' '+s;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)!=' ' && s.charAt(i-1)==' ')
                count++;
        }
        return count;
    }
}