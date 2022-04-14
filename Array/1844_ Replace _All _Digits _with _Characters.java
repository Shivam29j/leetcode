class Solution {
    public String replaceDigits(String s) {
         char[] res=s.toCharArray();

        for(int i=1;i<res.length;i+=2){
            res[i]=(char)(res[i-1] + res[i] - '0');
        }
        return new String(res);
    }
}