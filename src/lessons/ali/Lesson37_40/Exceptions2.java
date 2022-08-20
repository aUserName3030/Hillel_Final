package lessons.ali.Lesson37_40;

public class Exceptions2 {
    public static void main(String[] args) {
        //Checked

        /*File file = new File("testPath");

        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception");
        }*/

        //runtime

        //int a = 1/0;

/*
        String string = null;
        string.length();
        */

        int[] arr = new int[2];
        System.out.println(arr[2]);
    }
}
