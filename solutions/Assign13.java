public class Assign13 {
    public static void main(String[] args) {
        printNumberTriangle4(5);
    }

    public static void printNumberTriangle4(int row){
        for (int i = 1; i <= row; i++){
            for (int j = i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
