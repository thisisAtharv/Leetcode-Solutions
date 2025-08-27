class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        HashMap<Character, String> pattToWord = new HashMap<>();
        HashMap<String, Character> wordToPatt = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String wd = words[i];
            if (pattToWord.containsKey(ch) && !pattToWord.get(ch).equals(wd)) {
                return false;
            }
            if (wordToPatt.containsKey(wd) && !wordToPatt.get(wd).equals(ch)) {
                return false;
            }
            pattToWord.put(ch, wd);
            wordToPatt.put(wd, ch);
        }
        return true;
    }
}