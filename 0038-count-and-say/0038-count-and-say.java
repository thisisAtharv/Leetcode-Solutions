class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        String res = "1";
        int count = 1;
        for (int i = 2; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j <= res.length(); j++) {
                if (j < res.length() && res.charAt(j) == res.charAt(j - 1)) {
                    count++;
                } else {
                    sb.append(count).append(res.charAt(j - 1));
                    count = 1;
                }
            }
            res = sb.toString();
        }
        return res;
    }
}