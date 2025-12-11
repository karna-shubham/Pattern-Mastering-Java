public class Assign30 {
    public static void main (String[] args){
        printXPattern(7);
    }

    public static void printXPattern(int row){
        for (int i = 1; i <= row; i++){
            for (int j = 1; j <= row; j++){
                //star
                if (i==j || i+j == row + 1){
                    System.out.print("X");
                }else{//space
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
