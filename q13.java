class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<Character, Integer>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length()) {
                if (romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1))) {
                    res += romanMap.get(s.charAt(i + 1)) - romanMap.get(s.charAt(i));
                    i++;
                    continue;
                }
            }

            res += romanMap.get(s.charAt(i));
        }

        return res;
    }
}
