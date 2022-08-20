package lessons.ali.Lesson09;

public class Break {
    public static void main(String[] args) {
        for (int i = 0; i <= 15; i++) {
            if (i % 2 == 0) {
                continue;
            } else if (i == 13) {
                System.out.println("Итератор устал");
                break;
            }
            System.out.println(i + " нечётное");
        }
    }
}
