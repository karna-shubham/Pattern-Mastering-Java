public class Assign33 {
    public static void main (String[] args){
        printPascalTriangle(5);
    }

    public static void printPascalTriangle(int row){
        //declaration
        int[] prev = new int[row];
        

        //mainloop
        for(int i = 0; i < row; i++){
            int[] curr = new int[row];
            //spacePrint
            for(int j = 0; j < row-i-1; j++){
                System.out.print(" ");
            }

            //numberPrint
            for(int j = 0; j <= i; j++){
                if(j==0 || j == i){
                    curr[j] = 1;
                }else{
                    curr[j] = prev[j-1] + prev[j];
                }
                System.out.print(curr[j] + " ");
            }
            System.out.println();
            prev = curr;
        }
    }
}
