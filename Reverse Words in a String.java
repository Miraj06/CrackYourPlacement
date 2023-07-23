class Solution {
    public String reverseWords(String s) {
        String reverse="";
        int n=s.length();
        int i=n-1;
        while(i>=0){
            if(s.charAt(i)==' '){
                i--;
                continue;
            }

            int j=i+1;
            while(i>=0 && s.charAt(i)!=' '){
                i--;
            }
            if(reverse.equals("")){
                reverse = reverse+s.substring(i+1,j);
            }
            else{
                reverse = reverse+" "+s.substring(i+1,j);
            }
        }
        return reverse;
    }
}
