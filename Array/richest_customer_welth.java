class Solution {
    public int maximumWealth(int[][] accounts) {
       int sum =0;
        int  omax =0;
        for( int[] i : accounts){
            int cmax =0;
            for(int  j =0;j<i.length;j++){
                cmax+=i[j];
            }
            omax = Math.max(cmax,omax);
        }
        return omax;
    }

}