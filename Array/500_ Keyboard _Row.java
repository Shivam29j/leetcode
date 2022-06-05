class Solution {
    public String[] findWords(String[] words) {
        List<String> l1 = new ArrayList<>();
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";
        for(int i=0;i<words.length;i++)
        {
            String s = words[i];
            String res = "";
            String x = String.valueOf(s.charAt(0)).toLowerCase();
            if(s1.contains(x))
            {
                res = s1;
            }
            if(s2.contains(x))
            {
                res = s2;
            }
            if(s3.contains(x))
            {
                res = s3;
            }
            boolean check = false;
            for(int j=1;j<s.length();j++)
            {
                String y = String.valueOf(s.charAt(j)).toLowerCase();
                if(!res.contains(y))
                {
                    check = true;
                    break;
                }
            }
            if(check == false)
            {
                l1.add(s);
            }
        }
        String res[] = new String[0];
        if(l1.size() > 0)
        {
            res = new String[l1.size()];
            for(int i=0;i<l1.size();i++)
            {
                res[i] = l1.get(i);
            }
        }
        return res;
    }
}