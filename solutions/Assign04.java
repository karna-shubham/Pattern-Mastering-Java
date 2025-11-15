public class Assign04 {
    public static void main(String[] args) {
        printTriangle2(5);
        forumulaPrintTriangle2(5);

    }

    // Pattern 2: Stars decrease with row  
    // Row 1: n stars, Row 2: n-1 stars, etc.
    public static void printTriangle2(int n) {
        for (int i = 1; i<= n; i++){
            for (int j = n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    
    }
    public static void forumulaPrintTriangle2(int n){
        for (int i=1; i<=n; i++){
            for (int j = 1; j <= n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}


