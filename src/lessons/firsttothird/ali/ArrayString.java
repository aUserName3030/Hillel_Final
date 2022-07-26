package lessons.firsttothird.ali;

public class ArrayString {
    public static void main(String[] args) {
        String[] strings = new String[3];
        strings[0] = "a";
        strings[1] = "b";
        strings[2] = "c";

        for(String string:strings) {
            System.out.println(string);
        }

        int[] ints = {1,2,3,4,5,6};
        int sum = 0;

        for (int i:ints) {
            sum += i;
        }

        System.out.println(sum);
    }
}

