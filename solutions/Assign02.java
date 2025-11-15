public class Assign02 {
    public static void main(String[] args){
        printHollowRectangle(4, 5, "&");
        idealPrintHollowRectangle(5, 7, "|");

    }

    //brute force. not optimal solution
    public static void printHollowRectangle(int row, int col, String sym){
        for(int i = 1; i<=row; i++){
            if(i==1 || i == row){
                for (int j = 1; j<=col; j++){
                    System.out.print(sym);
                }
                System.out.println();
            }else{
                for (int j = 1; j<=col; j++){
                    if (j==1 || j == col) {
                        System.out.print(sym);
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
    
    //optimal soltion. 
    public static void idealPrintHollowRectangle(int row, int col, String sym){
        for (int i = 1; i <= row; i++){
            for (int j = 1; j <= col; j++){
                //universal condition: print symbol if on border else print space
                if (i == 1 || i == row || j == 1 || j == col){
                    System.out.print(sym);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
