public class Assign24 {
    public static void main (String[] args){
        printParallelogram(5);
    }

    public static void printParallelogram(int row){
        for (int i = row; i >= 1; i--){
            String star = "*";
            String space = " ";
            int spaceCnt = (i-1)*2;
            System.out.println(space.repeat(spaceCnt) + star.repeat(row));
        }
    }
}
1