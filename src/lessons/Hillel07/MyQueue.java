package lessons.Hillel07;

interface MyQueues<T> {
    void add(T item);
    T remove();
    T peek();
    int size();
    boolean isEmpty();
}

public class MyQueue<T> implements MyQueues<T>{
    private int size;
    private Node<T> head, tail;

    public MyQueue() {
        size = 0;
        head = tail = null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(T item) {
        Node node = new Node(item);
        if (isEmpty()) {
            head = node;
        } else {
            tail.setNextLink(node);
        }
        tail = node;
        size++;
    }

    @Override
    public T remove() {
        if (isEmpty()) {
            return null;
        }
        T result = head.getObj();
        head = head.getNextLink();
        size--;
        if (isEmpty()) {
            tail = null;
        }
        return result;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return head.getObj();
    }

    @Override
    public int size() {
        return size;
    }

    private class Node<T> {

        private T obj;
        private Node nextLink;

        public Node(T obj) {
            this.obj = obj;
        }


        public Node getNextLink() {
            return nextLink;
        }

        public void setNextLink(Node nextLink) {
            this.nextLink = nextLink;
        }

        public T getObj() {
            return obj;
        }

        public void setObj(T obj) {
            this.obj = obj;
        }

    }
}
