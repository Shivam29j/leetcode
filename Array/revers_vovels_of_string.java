class Solution {
    public String reverseVowels(String s) {
        char arr[]=s.toCharArray();
    String vowels="aeiouAEIOU";
    int i=0,j=arr.length-1;
    while(i<j)
    {
        if(!vowels.contains(arr[i]+""))
        {
            i++;
        }
        else if(!vowels.contains(arr[j]+""))
        {
            j--;
        }
        else
        {
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
        return String.valueOf(arr); 
    }
}