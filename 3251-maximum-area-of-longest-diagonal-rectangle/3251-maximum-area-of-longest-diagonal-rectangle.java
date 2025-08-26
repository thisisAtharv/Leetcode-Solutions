class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double calc = 0;
        int savedIndex = 0;
        for (int i = 0; i < dimensions.length; i++) {
            int left = dimensions[i][0];
            int right = dimensions[i][1];
            double dlen = Math.sqrt(left * left + right * right);
            int area = left * right;
            if (dlen > calc || (dlen == calc && area > dimensions[savedIndex][0] * dimensions[savedIndex][1])) {
                calc = dlen;
                savedIndex = i;
            }
        }
        int width = dimensions[savedIndex][0];
        int height = dimensions[savedIndex][1];
        return width*height;
    }
}