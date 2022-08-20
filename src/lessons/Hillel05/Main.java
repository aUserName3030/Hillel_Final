package lessons.Hillel05;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.addAsLast(1);
        myLinkedList.addAsFirst(2);
        myLinkedList.add(5,1);
        myLinkedList.add(10,2);
        System.out.println(myLinkedList);
        myLinkedList.remove(1);
        System.out.println(myLinkedList.get(1));
        myLinkedList.removeFirst();
        System.out.println(myLinkedList.getFirst());
        myLinkedList.removeLast();
        System.out.println(myLinkedList.getLast());
        System.out.println(myLinkedList);
    }


}
