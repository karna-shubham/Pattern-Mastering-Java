public class Assign16 {
    public static void main(String[] args) {
        printAlphabetTriangle1(4);
    }

    public static void printAlphabetTriangle1(int n){
        for (int i = 65; i<=65+n-1; i++ ){
            for (int j = 65; j <= i; j++){
                System.out.print((char) j);
            }
            System.out.println();
        }
    }
}
