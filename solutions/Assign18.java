public class Assign18 {
    public static void main(String[] args) {
        printAlphabetTriangle3(4);
    }

    public static void printAlphabetTriangle3(int n){
        int cnt = 65;
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print((char) cnt);
                cnt += 1;
            }
            System.out.println();
        }
    }
}
