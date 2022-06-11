class Solution {
    public String kthDistinct(String[] arr, int k) {
         Map<String, Integer> map = new HashMap<>();
        for(String ar : arr){
            map.put(ar, map.getOrDefault(ar,0)+1);
        }
        for(int i=0; i<arr.length;i++){
            if(map.get(arr[i])==1 && --k==0){
                return arr[i];
            }
        }
        return "";
    }
}