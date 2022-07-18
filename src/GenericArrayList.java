import java.util.Arrays;

public class GenericArrayList<E> {
      int size;
      E[] arr = (E[]) new Object[0];

      public void add(E obj) {
          size++;
          arr = Arrays.copyOf(arr,size);
          arr[size-1] = obj;
      }

      public void remove(int i) {
          size--;
          E[] arrCopy = (E[]) new Object[size];
          System.arraycopy(arr,0,arrCopy,0,i);
          System.arraycopy(arr,i+1,arrCopy,i,arr.length-i-1);
          arr = arrCopy;
      }

      public int size() {
          return this.size;
      }

      public E get(int i) {
          return arr[i];
      }

    public void clear() {
        for (int i = 0; i < size; i++) {
            arr[i] = null;
        }
        size = 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
