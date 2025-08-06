class Solution {
    public int lengthOfLongestSubstring(String s) {
        String res = "";
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (res.indexOf(ch) != -1) {
                res = res.substring(res.indexOf(ch) + 1);
                res += ch;
                max = Math.max(max, res.length());
            } else {
                res += ch;
                max = Math.max(max, res.length());
            }
        }        
        return max;
    }
}
