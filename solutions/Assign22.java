public class Assign22{
    public static void main(String[] args){
        printSolidRhombus(5);
    }

    public static void printSolidRhombus(int row){
        for(int i = 1; i <= row; i++){
            //leading space
            for(int j = i; j < row; j++){
                System.out.print(" ");
            }

            //star
            String star = "*";
            System.out.println(star.repeat(row));
        }
    }

}