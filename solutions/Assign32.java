public class Assign32 {
    public static void main (String[] args){
        printHollowDiamondNumber(5);
    }

    public static void printHollowDiamondNumber(int n){
        int temp = 2*n - 1;
        //upper half
        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= temp; j++){
                if (i+j == n + 1 || j-i == n-1){
                    System.out.print(i);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //lower half
        for (int i = n+1; i <= temp; i++){
            for(int j = 1; j <= temp; j++){
                if(i-j == n-1 || i+j == n + temp){
                    System.out.print(temp+1-i);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
