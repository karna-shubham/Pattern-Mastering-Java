public class Assign05 {
    public static void main(String[] args) {
        printTriangle3(5);
        forumulaPrintTriangle3(5);

        
    }

    // Pattern 3: Right-aligned increasing
    // Spaces + stars, right-aligned
    public static void printTriangle3(int n) {
        String space = " ";
        String sym = "*";
        for (int i = 1; i<=n; i++){
            System.out.println(space.repeat(n-i)+sym.repeat(i));
        }

    }

    public static void forumulaPrintTriangle3(int n){
             
        for (int i=1; i<=n; i++){
            //for space
            for (int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }

            //for star
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

