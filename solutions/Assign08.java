public class Assign08 {
    public static void main (String[] args){
        printInvertedPyramid(3);
    }

    public static void printInvertedPyramid (int row){
        for (int i = row; i >= 1; i--){
            //leadin spaces
            for (int j = i; j<row; j++){
                System.out.print(" ");
            }

            //stars
            for (int j = 1; j<=(i*2)-1; j++){
                System.out.print("*");
            }

            //trail spaces
            for (int j = i; j<row; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
