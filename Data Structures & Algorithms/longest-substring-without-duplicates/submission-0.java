class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int maxlen = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char ptr = s.charAt(right);

            if (map.containsKey(ptr) && map.get(ptr) >= left) {
                left = map.get(ptr) + 1;
            }

            map.put(ptr, right);
            maxlen = Math.max(maxlen, right - left + 1);
        }

        return maxlen;
    }
}