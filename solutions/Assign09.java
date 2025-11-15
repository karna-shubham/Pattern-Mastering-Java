public class Assign09 {
    public static void main (String [] args){
        printDiamond(4);
    }

    public static void printDiamond(int row){
        printPyramid(row);
        printInvertedPyramid(row-1);
    }

    public static void printPyramid (int row){
        for (int i = 1; i <= row; i++){
            //leadin spaces
            for (int j = i; j<row; j++){
                System.out.print(" ");
            }

            //starts
            for (int j = 1; j<=(i*2)-1; j++){
                System.out.print("*");
      
            }
            System.out.println();
        }
    }

    public static void printInvertedPyramid (int row){
        for (int i = row; i >= 1; i--){
            //leadin spaces
            for (int j = i; j<=row; j++){
                System.out.print(" ");
            }

            //stars
            for (int j = 1; j<=(i*2)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
