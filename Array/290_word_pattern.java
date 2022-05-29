class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strs = s.split(" ");
        HashMap<Character,String> map = new HashMap<Character,String>();
        if(strs.length != pattern.length())
        {
            return false;
        }

        for(int i=0;i<pattern.length();i++)
        {
            char c = pattern.charAt(i);
            if(map.containsKey(c))
            {
                if(!map.get(c).equals(strs[i]))
                    return false;
            }
            else
            {
                if(map.containsValue(strs[i]))
                    return false;
                map.put(c,strs[i]);
            }
        }
        return true; 
    }
}