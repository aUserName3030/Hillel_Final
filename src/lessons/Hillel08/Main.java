package lessons.Hillel08;

public class Main {
    public static void main(String[] args) {
        MyStack myStack = new MyStack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        System.out.println(myStack.peek());
        System.out.println(myStack.size());
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.search(2));
        System.out.println(myStack.size());
    }
}
