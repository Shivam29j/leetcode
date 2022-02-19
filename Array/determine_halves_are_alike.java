class Solution {
    public boolean halvesAreAlike(String s) {
         int count = 0, len = s.length();
        String vowels = "aeiouAEIOU";
        for(int i=0; i<len; i++){
            if(i < len/2){
                if(vowels.contains(s.charAt(i)+"")) 
                    count++;  
            }
            else{
                if(vowels.contains(s.charAt(i)+""))    
                    count--;
            }  
        }
        return count == 0;
    }
}