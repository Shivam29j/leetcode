class Solution {
    public int titleToNumber(String S) {
        int result  = 0;
        for (int i = 0; i < S.length(); i++){
            result *= 26;
            result += ((S.charAt(i) - 'A') + 1);    
        }
    
        return result;  
    }
}