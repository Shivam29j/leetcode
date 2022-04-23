class Solution {
    public boolean detectCapitalUse(String word) {
         int capsCount = 0;
        for (int i = 0; i < word.length(); i++) 
            if (Character.isUpperCase(word.charAt(i)))
                capsCount++;
        return (capsCount == word.length() || capsCount == 0 || capsCount == 1 &&Character.isUpperCase(word.charAt(0)));

    }
}