class Solution {
    public String longestCommonPrefix(String[] strs) {
        String firstStr = strs[0];
    char[] first = firstStr.toCharArray();
    int pos = first.length - 1;
        if (pos < 0) return "";
        for (int i = 1; i < strs.length; i++) {
        String next = strs[i];
        int length = next.length();
        if (length <= pos) pos = length - 1;
        for (int j = 0; j <= pos; j++) {
            if (first[j] != next.charAt(j)) {
                pos = j - 1;
                break;
            }
        }
        if (pos < 0) return "";
    }
    return firstStr.substring(0, pos + 1);
}
}
    