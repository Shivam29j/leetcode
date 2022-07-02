class Solution {
    public int countAsterisks(String s) {
        int barCount = 0;
        int starCount = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '|') {
                barCount++;
            }
            if(barCount==0 || barCount % 2 == 0) {
                if(s.charAt(i) == '*') {
                    starCount++;
                }
            }
        }
        return starCount;
    }
}