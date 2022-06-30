class Solution {
    public int countBinarySubstrings(String s) {
         int c=0;
        int curr=1,h=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)) curr++;
            else{
                h=curr;
                curr=1;
            }
            if(h>=curr) c++;
        }
        return c;
    }
}