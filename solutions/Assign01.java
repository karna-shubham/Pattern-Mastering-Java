public class Assign01 {
    public static void main (String[] args){
        printGrid(5, 7, "*");
        printGrid(3, 10, "#");

    }

    public static void printGrid (int rows, int cols, String symbol){
        for (int i = 1; i<=rows ; i++){
            for (int j = 1; j<=cols; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}