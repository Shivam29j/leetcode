class Solution {
    public int bitwiseComplement(int n) {
        return (int)(Math.pow(2,Integer.toBinaryString(n).length())-1-n); 
    }
}