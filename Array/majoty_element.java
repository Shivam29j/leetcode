class Solution
{
    static int majorityElement(int a[], int size)
    {

        Map<Integer, Integer> map = new HashMap<>();
        for(int e: a) {
            map.put(e, map.getOrDefault(e, 0) + 1);
        }
        for(int key: map.keySet()) {
            if(map.get(key) > (size/2)) {
                return key;
            }
        }
        return -1;
    }
}