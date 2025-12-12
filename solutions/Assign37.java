public class Assign37 {
    public static void main(String[] args){
        printReverseSpiral(5);
    }

    public static void printReverseSpiral(int n){
        int top = 0, left = 0;
        int bottom = n-1, right = n-1;
        int cnt = n*n;
        int[][] matrix = new int[n][n];

        while (top<=bottom && left<=right){
            //top--left to right
            for (int i = left; i <= right; i++){
                matrix[top][i] = cnt;
                cnt -= 1;
            }
            top += 1;

            //right--top to bottom
            for(int i = top; i <= bottom; i++){
                matrix[i][right] = cnt;
                cnt -= 1;
            }
            right -= 1;

            //bottom -- right to left
            if (top<= bottom){
                for (int i = right; i >= left; i--){
                    matrix[bottom][i] = cnt;
                    cnt -= 1;
                }
                bottom -= 1;
            }

            //left -- bottom to top
            if (left <= right){
                for (int i = bottom; i >= top; i--){
                    matrix[i][left] = cnt;
                    cnt -= 1;
                }
                left += 1;
            }
            // System.out.println();
        }
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }

    }
}
