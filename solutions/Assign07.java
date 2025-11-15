public class Assign07 {
    public static void main (String[] args){
        printPyramid(3);
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

            //trail spaces
            for (int j = i; j<row; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
