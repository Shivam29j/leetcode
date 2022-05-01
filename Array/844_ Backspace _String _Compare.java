class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb1= new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(sb1.length()!=0 && s.charAt(i)=='#')
            {
                sb1.delete(sb1.length()-1,sb1.length());
            }
            else if(s.charAt(i)!='#')
            {
                sb1.append(s.charAt(i));
            }
        }
        for(int i=0;i<t.length();i++)
        {
            if(sb2.length()!=0 && t.charAt(i)=='#')
            {
                sb2.delete(sb2.length()-1,sb2.length());
            }
            else if(t.charAt(i)!='#')
            {
                sb2.append(t.charAt(i));
            }
        }
        if(sb1.toString().equals(sb2.toString()))
        {
            return true;
        }
        return false; 
    }
}