public class Assign25 {
    public static void main (String[] args){
        printNumberPyramid1(5);
    }

    public static void printNumberPyramid1(int row){
        for (int i = 1; i <= row; i++){
            //leading space
            for (int j = i; j < row; j++){
                System.out.print(" ");
            }

            //numbers
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }
}
