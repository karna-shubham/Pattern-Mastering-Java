public class Assign17 {
    public static void main(String[] args) {
        printAlphabetTriangle2(4);
    }

    public static void printAlphabetTriangle2(int n){
        for (int i = 65; i<=65+n-1; i++){
            for (int j = 65; j<=i; j++){
                System.out.print((char) i);
            }
            System.out.println();
        }
    }
}
