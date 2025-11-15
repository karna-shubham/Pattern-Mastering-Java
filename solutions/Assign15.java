public class Assign15 {
    public static void main (String [] args){
        printBinaryTree(4);
    }

    //approach 1: sum based
    /*public static void printBinaryTree (int row){
        for (int i = 1; i<=row; i++){
            for (int j = 1; j<=i; j++){
                if ((i+j)%2==0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }*/

    //aproach 2: odd even
    /*public static void printBinaryTree (int row){
        int cnt = 1;
        for (int i = 1; i<=row; i++){
            for (int j = 1; j<=i; j++){
                if (cnt%2==0){
                    System.out.print(0);
                    
                }else{
                    System.out.print(1);
                }
                cnt += 1;
            }
            System.out.println();
        }
    }*/

    //aproach 3: Row parity based
    public static void printBinaryTree(int row){
        for (int i = 1; i <= row; i++) {
            int start = (i % 2 == 1) ? 1 : 0;  // Odd rows start with 1, even with 0
            for (int j = 1; j <= i; j++) {
                System.out.print((start + j - 1) % 2);
            }
            System.out.println();
        }
    }

}
