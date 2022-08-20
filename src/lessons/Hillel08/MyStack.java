package lessons.Hillel08;

interface MyStacks<T> {
    void push(T item);
    T pop();
    T peek();
    boolean isEmpty();
    int size();
    int search(T item);
}

public class MyStack<T> implements MyStacks<T> {
    private T obj;
    private MyStack<T> previousLink;

    MyStack() {}

    MyStack(T obj) {
        this.obj = obj;
    }

    MyStack(MyStack<T> previousLink, T obj) {
        this.previousLink = previousLink;
        this.obj = obj;
    }


    @Override
    public boolean isEmpty() {
        return this.previousLink == null;
    }

    @Override
    public void push(T item) {
        this.previousLink = new MyStack<>(this.previousLink,this.obj);
        this.obj = item;
    }

    @Override
    public T pop() {
        if(isEmpty()) {
            return null;
        }

        T top = this.obj;
        this.obj = this.previousLink.obj;
        this.previousLink = this.previousLink.previousLink;

        return top;
    }

    @Override
    public T peek() {
        return this.obj;
    }



    @Override
    public int size() {
        if (this.isEmpty()) {
            return 0;
        } else {
            return this.previousLink.size() + 1;
        }
    }

    @Override
    public int search(T item) {
        int i = 1;
        for (MyStack<T> myStack = this; !myStack.isEmpty(); myStack = myStack.previousLink) {
            if (myStack.obj.equals(item)) {
                return i;
            }
        }

        return -1;
    }
}
