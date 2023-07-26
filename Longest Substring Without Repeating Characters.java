class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> set = new HashSet<>();
        int start =0; 
        for(int i=0; i<n; i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                maxLength = Math.max(maxLength, i - start +1);

            }
            else{
                while (set.contains(s.charAt(i))) {
                    set.remove(s.charAt(start));
                    start++;
                }
                set.add(s.charAt(i));
            }
        }
        return maxLength;
    }
}
