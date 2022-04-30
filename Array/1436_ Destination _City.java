class Solution {
    public String destCity(List<List<String>> paths) {
        var sources = new HashSet<String>();
	    for (var path : paths)
		    sources.add(path.get(0));
	    for (var path : paths)
		    if (!sources.contains(path.get(1)))
		        return path.get(1);
	    return null;
    }
}