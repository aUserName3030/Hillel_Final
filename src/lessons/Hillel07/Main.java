package lessons.Hillel07;

public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue<>();
        queue.isEmpty();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.size());
    }
}