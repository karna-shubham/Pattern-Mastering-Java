public class Assign14 {
    public static void main(String[] args) {
        printFloydTraingle(5);
    }

    public static void printFloydTraingle(int row){
        int cnt = 1;
        for (int i = 1; i<=row; i++){
            for (int j =1; j <= i; j++){
                System.out.print(cnt + " ");
                cnt += 1;
            }
            System.out.println();
        }
    }
}


