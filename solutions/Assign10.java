public class Assign10 {
    public static void main (String [] args){
        printNumberTriangle1(4);
    }
    
    public static void printNumberTriangle1(int row){
        for (int i = 1; i<=row; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
