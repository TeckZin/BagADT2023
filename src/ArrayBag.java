import java.util.ArrayList;

public class ArrayBag <T> implements BagInterface <T> {
    private ArrayList<T> arrayBag;

    public ArrayBag(){
        this.arrayBag = new ArrayList<T>();
    }
    @Override
    public int getCurrentSize() {
        return 3;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean add(Object newEntry) {
        return false;
    }

    @Override
    public boolean remove(Object anEntry) {
        return false;
    }

    @Override
    public Object remove() {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(Object anEntry) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public int getFrequencyOf(Object anEntry) {
        return 0;
    }
}
