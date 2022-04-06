package oj;/**
 * Created by yangningkai on 2019/3/7.
 */

/**
 * @Description:
 * @Author: yangningkai
 * @CreateDate: 2019/3/7 9:17
 * @Version:
 */
public class Question_1108 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        Boolean aBoolean = searchMatrix(matrix, 100);
        System.out.println(aBoolean);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null||matrix.length == 0||matrix[0] == null||matrix[0].length == 0) {
            return false;
        }
        int rowNum = matrix.length;//行数
        int colNum = matrix[0].length;//列数
        //寻找值
        Boolean bool = false;
        loop:
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                if (matrix[i][j] == target) {
                    bool = true;
                    break loop;
                }
            }
        }
        return bool;
    }
}
