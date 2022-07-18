class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int countWidth=0;
        int[] ans={1, 0};
        for(int i=0;i<s.length();i++){
            if(countWidth+widths[s.charAt(i)-97]<=100){
                countWidth+=widths[s.charAt(i)-97];
            }
            else{
                i--;
                countWidth=0;
                ans[0]++;
            }
        }
        ans[1]=countWidth;
        return ans;
    }
}