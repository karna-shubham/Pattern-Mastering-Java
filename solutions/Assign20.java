public class Assign20 {
    public static void main(String[] args) {
        printHollowPyramid(5);
    }

    public static void printHollowPyramid(int row){
        for(int i = 1; i<=row; i++){
            //leadin spaces
            for(int j = i; j<=row; j++){
                System.out.print(" ");
            }

            //for stars
            for(int j = 1; j <= (i*2)-1; j++){
                if (i==1 || i==row || j==1 || j == (i*2)-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");                    
                }
            }
            System.out.println();
        }
    }
}
