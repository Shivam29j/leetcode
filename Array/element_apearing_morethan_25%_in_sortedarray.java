class Solution {
    public int findSpecialInteger(int[] arr) {
        if(arr.length == 1) {
            return arr[0];
        }
        int count=1;
        float time = (arr.length * (0.25f));
        for(int i=0;i<arr.length;i++){
            if((i+1) != arr.length && arr[i] == arr[i+1]) {
                count++;
            }
            else {
                if(count > time) {
                    return arr[i];
                }
                count = 1;
            }
        }
        return 0;
    }
}