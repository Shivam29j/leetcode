class Solution {
    public String decodeMessage(String key, String message) {
        StringBuilder sb = new StringBuilder();
        List<Character> list = new ArrayList<>();
        for(int i = 0; i < key.length(); i++){
            if(key.charAt(i) == ' '){
                continue;
            }
            if(list.contains((key.charAt(i)))){
                continue;
            }else{
                list.add(key.charAt(i));
            }
        }
		
        for(char c: message.toCharArray()){
            if(c == ' '){
                sb.append(" ");
            }else{
                sb.append((char) (list.indexOf(c) + 'a'));
            }

        }
        return sb.toString();
    }
}