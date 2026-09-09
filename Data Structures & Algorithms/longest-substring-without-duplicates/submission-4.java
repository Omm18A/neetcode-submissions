class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0;
        HashMap<Character, Integer> a = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (a.containsKey(ch)) {
                left = Math.max(left, a.get(ch) + 1);
            }
            a.put(ch, right);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
