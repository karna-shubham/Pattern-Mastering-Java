public class Assign29 {
    public static void main (String[] args){
        printCrossPattern(7);
    }

    // public static void printCrossPattern(int row){
    //     String star = "*";
    //     String space = " ";
    //     for(int i = 1; i <= row; i++){
    //         if (i == row/2 + 1){
    //             System.out.println(star.repeat(row));
    //         }else{
    //             System.out.println(space.repeat(row/2) + star);
    //         }
    //     }
    // }
    public static void printCrossPattern (int row){
        for (int i = 1; i <= row; i++){
            for (int j = 1; j <= row; j++){
                //for star
                if (i == row/2 + 1 || j == row/2 + 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
