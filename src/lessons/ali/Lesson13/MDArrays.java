package lessons.ali.Lesson13;

public class MDArrays {
    public static void main(String[] args) {
        int[][] ints = {{1,2,3},{4,5,6},{7,8,9}};
        for (int[] i:ints) {
            for (int j:i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
