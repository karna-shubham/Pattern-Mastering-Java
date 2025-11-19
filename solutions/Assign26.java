public class Assign26 {
    public static void main (String[] args){
        printNumberPyramid2(4);
    }

    public static void printNumberPyramid2(int row){
        for (int i = 1; i <= row; i++){
            //leading spaces
            for (int j = i; j < row; j++){
                System.out.print(" ");
            }

            //numbers
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
