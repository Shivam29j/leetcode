class Solution {
    public int uniqueMorseRepresentations(String[] words) {
         String[] tokens = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for ( String word : words ) {
            StringBuilder sb = new StringBuilder();
            for ( int i = 0; i < word.length(); i++ ) {
                sb.append( tokens[word.charAt(i)-'a'] );
            }
            set.add( sb.toString() );
        }
        return set.size();
    }
}