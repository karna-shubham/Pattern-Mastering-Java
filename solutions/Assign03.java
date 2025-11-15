public class Assign03 {
    public static void main (String[] args){
        printTriangle1(5);
        forumulaPrintTriangle1(5);
    }

    // Pattern 1: Stars increase with row
    // Row 1: 1 star, Row 2: 2 stars, etc.
    public static void printTriangle1(int n) {
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
     
    }

    public static void forumulaPrintTriangle1(int n){
        for (int i=1; i<=n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
