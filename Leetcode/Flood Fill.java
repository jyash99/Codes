class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor) {
            return image;
        }
        int start_color = image[sr][sc];
        recursive(image, sr, sc, newColor, start_color);
        return image;
    }
    
    public void recursive(int[][] image, int sr, int sc, int newColor, int start_color) {
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != start_color) {
            return;
        }
        image[sr][sc] = newColor;
        recursive(image, sr - 1, sc, newColor, start_color);
        recursive(image, sr + 1, sc, newColor, start_color);
        recursive(image, sr, sc - 1, newColor, start_color);
        recursive(image, sr, sc + 1, newColor, start_color);
    }
}