public class Assign36 {
    public static void main(String[] args){
        printCheckerboard(5, 'X', '0');
    }

    public static void printCheckerboard(int n, char sym1, char sym2){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=n; j++){
                
                if((i+j) % 2 == 0){
                    System.out.print(sym1 + " ");
                }else{
                    System.out.print(sym2 + " ");
                }
            }
            System.out.println();
        }
    }
}
