public class Assign11 {
    public static void main(String[] args) {
        printNumberTriangle2(5);
    }

    public static void printNumberTriangle2 (int row){
        for (int i = 1; i <= row; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }


}
