package day01_practice;

//public class CountNegitivesIn2DArray {
//    package pkg;

    public class CountNegitivesIn2DArray {

        public static void main(String[] args) {
            int[][] matrix = {{-3, -2, -1, 1},
                    {-2,  2,  3, 4},
                    { 4,  5,  7, 8}
            };
            int cols = matrix[0].length;
            int rows = matrix.length;
            System.out.println(countNegitive(matrix,rows,cols));
        }

        public static int countNegitive(int[][] matrix, int rows, int cols) {
            int countOut = 0;
            int i = 0; //row index
            int j = cols - 1; //column index
            while(j >= 0 && i < rows) {
                if(matrix[i][j] < 0) {
                    countOut += (j + 1);
                    i += 1;
                } else {
                    j -= 1;
                }
            }
            return countOut;
        }
    }


