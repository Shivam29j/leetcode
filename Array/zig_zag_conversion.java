class Solution {
    public String convert(String s, int numRows) {
      StringBuilder a[]=new StringBuilder[numRows];
      int i=0;
      int j=0;
      boolean b=true;
    for(int ti=0;ti<numRows;ti++)
    {
        a[ti]=new StringBuilder("");
    }
    while(j<s.length()&&i<numRows)
    {  
       if(i==0)
           b=true;
        else if(i==numRows-1)
            b=false;
        a[i].append(s.charAt(j));
        j++;
        if(b==true&&numRows>1)
        i=i+1;
        else if(b==false&&numRows>1)
            i=i-1;
    }
    String res="";
    for(int k=0;k<numRows;k++)
    {
        res+=a[k].toString();
        
    }
    
 return res;     
    }
}