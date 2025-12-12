public class Assign35 {
    public static void main (String[] agrs){
        printSpiral(5);
    }

    public static void printSpiral(int n){
        int [][] matrix = new int [n][n];
        int top = 0, left = 0;
        int bottom = n-1, right = n-1;
        int num = 1;
        

        while(top<=bottom && left<=right){
            //top--left to right
            for (int i = left; i<=right; i++){
                matrix[top][i] = num;
                num += 1;
            }
            top+=1;   
            
            //right--top to bottom
            for(int i = top; i <= bottom; i++){
                matrix[i][right] = num;
                num+=1;
            }
            right -= 1;
            
            //bottom--right to left
            for(int i = right; i >= left; i--){
                matrix[bottom][i] = num;
                num += 1;
            }
            bottom -= 1;

            //left--bottom to top
            for(int i = bottom; i >= top; i --){
                matrix[i][left]=num;
                num+=1;
            }
            left+=1;
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.printf("%3d", matrix[i][j]);  // %3d for proper spacing
            }
            System.out.println();
        }

    }
}
