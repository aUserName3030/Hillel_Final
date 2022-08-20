package lessons.Hillel05;

public class MyLinkedList<T> {
    private class Node<T> {

        private Node<T> prevLink;
        private Node<T> nextLink;
        private T obj;

        public Node(T obj, Node<T> prevLink, Node<T> nextLink) {
            this.prevLink = prevLink;
            this.nextLink = nextLink;
            this.obj = obj;
        }

        public Node getPrevLink() {
            return prevLink;
        }

        public void setPrevLink(Node prevLink) {
            this.prevLink = prevLink;
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

    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public void addAsLast(T element) { //добавляет в конец
        Node<T> addNode = new Node<>(element,null,null);
        if (size == 0) {
            head = tail = addNode;
        } else {
            addNode.setPrevLink(tail);
            tail.setNextLink(addNode);
            tail = tail.getNextLink();
        }
        size++;
    }

    public void addAsFirst(T element) { //добавляет в конец
        Node<T> addNode = new Node<>(element,null,null);
        head.setPrevLink(addNode);
        addNode.setNextLink(head);
        head = addNode;
        if (size == 0) {
            tail = head;
        }
        size++;
    }

    public void add(T element, int i) {
        if (i == 0) {
            addAsFirst(element);
        } else if (i >= size) {
            addAsLast(element);
        } else {
            Node<T> currnetNode = head;
            for (int j = 1; j < i; j++) {
                currnetNode = currnetNode.getNextLink();
            }
            Node<T> addNode = new Node<>(element,null,null);
            addNode.setNextLink(currnetNode.getNextLink());
            addNode.setPrevLink(currnetNode);
            currnetNode.getNextLink().setPrevLink(addNode);
            currnetNode.setNextLink(addNode);
            size++;
        }
    }

    public void removeFirst(){
        switch(size) {
            case 0:
                return;
            case 1:
                clear();
                return;
            default:
                head.getNextLink().setPrevLink(null);
                head = head.getNextLink();
                size--;
                return;
        }
    }

    public void removeLast(){
        switch(size) {
            case 0:
                return;
            case 1:
                clear();
                return;
            default:
                tail.getPrevLink().setNextLink(null);
                tail = tail.getPrevLink();
                size--;
                return;
        }
    }

    public void remove(int i) { //по индексу
        if (i < 0 || i >=size) {
            return;
        } else if (i == 0) {
            removeFirst();
        } else if (i == size - 1) {
            removeLast();
        } else {
            Node<T> currnetNode = head;

            for (int j = 1; j <= i; j++) {
                currnetNode = currnetNode.getNextLink();
            }

            currnetNode.getPrevLink().setNextLink(currnetNode.getNextLink());
            currnetNode.getNextLink().setPrevLink(currnetNode.getPrevLink());
            size--;
        }
    }

    public void clear(){
        size = 0;
        head = tail = null;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<T> currentNode = head;

        for (int i = 0; i < size; i++) {
            result.append(currentNode.getObj());
            currentNode = currentNode.getNextLink();
            if (currentNode != null) {
                result.append(", ");
            } else {
                result.append("]");
            }
        }
        return  result.toString();
    }

    public int size(){
        return size;
    }

    public T getFirst() {
        if (size == 0) {
            return null;
        } else {
            return head.getObj();
        }
    }

    public T getLast() {
        if (size == 0) {
            return null;
        } else {
            return tail.getObj();
        }
    }

    public T get(int i) {
        if (i == 0) {
            getFirst();
        } else if (i == size - 1) {
            getLast();
        } else {
            Node<T> currnetNode = head.nextLink;

            for (int j = 1; j < i; j++) {
                currnetNode = currnetNode.getNextLink();

            }

            return currnetNode.getObj();
        }

        return null;
    }
}
