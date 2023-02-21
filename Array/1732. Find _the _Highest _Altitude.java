class Solution {
    public int largestAltitude(int[] gain) {
        int max =0;
        int count=0;
        for(int i=0;i<gain.length;i++){
            count+=gain[i];
            max=Math.max(max,count);
        }
        return max;
    }
}