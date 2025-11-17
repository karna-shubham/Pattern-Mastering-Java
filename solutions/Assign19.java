public class Assign19 {
    public static void main(String[] args){
        printHollowTriangle(5);
    }

    public static void printHollowTriangle(int row){
        for (int i = 1; i<=row; i++){
            for(int j = 1; j<=i; j++){
                if (i == 1 || i == row || j==1 || j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
            
        }
    }
}
