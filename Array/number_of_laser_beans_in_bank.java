class Solution {
    public int numberOfBeams(String[] bank) {
        int count=0,ans=0,previous=0;
     for(String s : bank)
     {
         count=0;
         for(int i=0;i<s.length();i++)
         {
            if(s.charAt(i)=='1')
            {
                count++;
            }
         }
         if(count>0)
         {
            ans+=previous*count;
            previous=count;
         }
     }
        return ans; 
    }
}