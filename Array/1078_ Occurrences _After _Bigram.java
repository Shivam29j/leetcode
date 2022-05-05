class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        StringBuilder sb=new StringBuilder();
        String texts[]=text.split(" ");
        for(int i=0;i<texts.length-2;i++)
            if(texts[i].equals(first) && texts[i+1].equals(second))
                sb.append(texts[i+2]+" ");
        if(sb.toString().equals(""))
            return new String[0];
        return sb.toString().trim().split(" "); 
    }
}