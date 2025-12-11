public class Assign28 {
    public static void main (String[] args){
        printHourglass(4);
    }

    public static void printHourglass(int row){
        //upper half
        for (int i = row; i >= 1; i--){
            //lead spaces
            for (int j = i; j < row; j++){
                System.out.print(" ");
            }

            //star
            for(int j = 1; j <= (i*2)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        for (int i = 2; i <= row; i++){
            //leading space
            for(int j = i; j < row; j++){
                System.out.print(" ");
            }

            //stars
            for (int j = 1; j <= (i*2)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
