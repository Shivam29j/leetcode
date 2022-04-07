class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);      
        int len = arr.length;
        int start = len / 20;
        int end = len-start; 
        double sum = 0;
        for(int i=start; i<end; i++)  sum += arr[i]; 
        return sum / (len - (2 * start)); 
    }
}