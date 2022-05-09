class Solution {
    public String licenseKeyFormatting(String s, int k) {
         s = s.replaceAll("-", "").toUpperCase();
    StringBuilder sb = new StringBuilder(s);
    int i = sb.length() - k;
    while(i > 0) 
    {
        sb.insert(i, '-');
        i = i - k;
    }
    return sb.toString();
    }
}