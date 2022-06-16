class Solution {
    public String toGoatLatin(String sentence) {
       String[] spltStr = sentence.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < spltStr.length; i++) {
            int k = i;
            StringBuilder sb = new StringBuilder();
            if (isVowel(spltStr[i].charAt(0))) {
                sb.append(spltStr[i]);
                sb.append("ma");
            } 
            else 
            {
                for (int j = 1; j < spltStr[i].length(); j++)
                {
                    sb.append(spltStr[i].charAt(j));
                }
                sb.append(spltStr[i].charAt(0));
                sb.append("ma");
            }
            while (k >= 0){
                sb.append('a');
                k--;
            }
            res.append(sb);
            res.append(" ");
        }
        return res.toString().trim(); 
    }
         private boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        return false;   
    }
}