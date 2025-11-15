public class Assing06 {
    public static void main(String[] args) {
        printTriangle4(5);
        forumulaPrintTriangle4(5);
    }

    // Pattern 4: Right-aligned decreasing
    // Spaces + stars, right-aligned
    public static void printTriangle4(int n) {
        String space = " ";
        String sym = "*";
        for (int i = n; i>=1; i--){
            System.out.println(space.repeat(n-i) + sym.repeat(i));
        }
    }

    public static void forumulaPrintTriangle4(int n){
             
        for (int i=1; i<=n; i++){
            //for space
            for (int j = 1; j<=i-1; j++){
                System.out.print(" ");
            }

            //for star
            for (int j = 1; j <= n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
