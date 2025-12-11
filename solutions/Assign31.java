public class Assign31 {
    public static void main (String[] args){
        printSquareWithDiagonals(5);
    }

    public static void printSquareWithDiagonals(int row){
        for (int i = 1; i <= row; i++){
            for (int j = 1; j <= row; j++){
                //star
                if (i == 1 || j == 1 || i == row || j == row || i == j || i+j == row+1){
                    System.out.print("X");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
