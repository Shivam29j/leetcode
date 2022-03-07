class Solution {
    public static String reversePrefix(String word, char ch) {
         StringBuilder sb=new StringBuilder();
        int index=word.indexOf(ch);
        sb.append(word.substring(0,index+1));
        sb.reverse();
        sb.append(word.substring(index+1));
        return sb.toString();
    }
    public static void main(String[] args) {
        String word = "abcdefd";
        char c = 'd';
        String ans = reversePrefix(word, ch);
        System.out.println(ans);
    }
}