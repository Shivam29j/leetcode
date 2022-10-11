class Solution {
    int MissingNumber(int array[], int n) {
          int y=n*(n+1)/2;
       // Your Code Here
       int sum=0;
       for(int i=0;i<array.length;i++){
           sum+=array[i];
           }
       return y-sum;
       
    }
}