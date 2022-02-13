class Solution {
    public List<String> stringMatching(String[] words) {
         List<String> ls = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words.length; j++){
                if(i==j) continue;
                if(words[j].contains(words[i]))
                    if(!ls.contains(words[i]))
                        ls.add(words[i]);
            }
        }     
        return ls;
    }
}