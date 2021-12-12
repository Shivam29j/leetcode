class Solution {
    public boolean isPalindrome(int x) {
         int temp = x;
    int rem = 0;
    boolean flag = false;
    int sum =0;
    
    while(x>0){
        
        rem = x%10;
        sum = rem+(sum*10);
        x=x/10;         
    }
     
    if(temp==sum)
    flag = true;
     
    return flag;
}   
}