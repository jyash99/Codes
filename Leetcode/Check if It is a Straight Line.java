class Solution {
    public boolean checkStraightLine(int[][] coord) {
        boolean flag = true;
        double slope = 0;
        if(coord[1][0] != coord[0][0]) {
            slope = ((double)(coord[1][1] - coord[0][1]) / (double)(coord[1][0] - coord[0][0]));
        } else {
            slope = -1;
        }
        double temp = 0;
        for(int i = 1; i < coord.length; i++) {
            if(coord[i][0] != coord[0][0]) {
                temp = ((double)(coord[i][1] - coord[0][1]) / (double)(coord[i][0] - coord[0][0]));
            } else {
                temp = -1;
            }
            if(slope != temp) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}