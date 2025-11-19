public class Assign27 {
    public static void main (String[] args){
        printPalindromeNumPyramid(5);
    }

    public static void printPalindromeNumPyramid(int row){
        for (int i = 1; i <= row; i++){
            //leading space
            for (int j = i; j < row; j++){
                System.out.print(" ");
            }

            //firstSet
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }

            //last set
            for (int j = (i-1); j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
