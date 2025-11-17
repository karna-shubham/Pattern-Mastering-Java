public class Assign21 {
    public static void main(String[] args){
        printButterfly(4);
    }

    public static void printButterfly(int row){
        //top crown
        for(int i = 1; i<=row; i++){
            //front star
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            //middle space
            for (int j = 1; j <= (row - i)*2; j++){
                System.out.print(" ");
            }

            //back star
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //bottom crown
        for(int i = row; i>=1; i--){
            //front star
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            //middlespace
            for(int j = 1; j <= (row-i)*2; j++){
                System.out.print(" ");
            }

            //back star
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
