class Solution {
    public String restoreString(String s, int[] indices) {
        
        
        char sa[]=new char[indices.length];
            for( int i=0;i<indices.length;i++){
                sa[indices[i]]=s.charAt(i);
            }
        String ans=new String(sa);
        
        
        return ans;
    }
    
}