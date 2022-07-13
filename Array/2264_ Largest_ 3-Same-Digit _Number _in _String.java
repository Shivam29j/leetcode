class Solution {
    public String largestGoodInteger(String num) {
         for(int i=9; i>=0; i--){
            String str = ""+i+i+i;
            if(num.contains(str))
                return str;
        }
        return "";
    }
}