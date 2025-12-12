public class Assign34 {
    public static void main (String[] args){
        printZigZagPattern(4,20);
    }
    public static void printZigZagPattern (int row, int col){
        int cycle = 2*(row-1);
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                int mod = j % cycle;
                if (mod == i || mod == cycle - i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
