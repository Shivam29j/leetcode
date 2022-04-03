class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int number : arr){
            map.put(number , map.getOrDefault(number,0) + 1);
        }
        
        HashSet<Integer> set = new HashSet<>(map.values());
        
        return map.size() == set.size();
    }
}