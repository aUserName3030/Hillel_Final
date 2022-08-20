package lessons.ali.Lesson23;

public class Lesson23 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("What");
        System.out.println(stringBuilder.toString());
        stringBuilder.append(" is the men?").append(" A miserable little pile of secrets.");
        System.out.println(stringBuilder.toString());
        System.out.printf("%d маленьких %s съели %-6.2fкг. бананов\n",12,"обезьян",16.1123123141);
        System.out.printf("Это так мило.");
    }
}
