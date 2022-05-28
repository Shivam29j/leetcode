class Solution {
    public int percentageLetter(String s, char letter) {
         double count = 0.0;

    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == letter) count++;
    }

    double percentage = count / s.length();
    return (int) (percentage * 100);
    }
}