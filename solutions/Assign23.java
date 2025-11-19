public class Assign23 {
    public static void main(String[] args) {
        printHollowRhombus(5);
    }

    public static void printHollowRhombus(int row){
        String star = "*";
        String space = " ";
        for (int i = 1; i <= row; i++){
            //leading space
            for(int j = i; j<row; j++){
                System.out.print(space);
            }

            //star
            if (i == 1 || i == row){
                System.out.println(star.repeat(row));
            }else{
                System.out.println(star + space.repeat(row-2) + star);
            }
            System.out.println();
        }
    }
}
