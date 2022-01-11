class Solution {
    public String largestOddNumber(String num) {
         int j=num.length()-1;
        for(;j>=0;j--)
        {
            int a=num.charAt(j)-'0';
            if(a%2!=0)break;
        }
        if(j==-1)return "";
        else return num.substring(0,j+1);
    }
}