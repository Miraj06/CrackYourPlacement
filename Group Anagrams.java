class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s1: strs){
            char[] ch = s1.toCharArray();
            Arrays.sort(ch);
            String s2 = new String(ch);
            if(!map.containsKey(s2)){
                map.put(s2, new ArrayList<>());
            }
            map.get(s2).add(s1);
        }
        return new ArrayList<>(map.values());
    }
}
