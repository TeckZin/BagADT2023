import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class ArrayBag <T> implements BagInterface <T> {
    private final ArrayList<T> arrayBag;

    public ArrayBag(){
        System.out.println("\\u001B[34m Array Bag Created");
        this.arrayBag = new ArrayList<T>();
    }
    @Override
    public int getCurrentSize() {
        return arrayBag.size();
    }

    @Override
    public boolean isEmpty() {
        return getCurrentSize() == 0;
    }

    @Override
    public boolean add(T newEntry) {

        try {
            arrayBag.add(newEntry);
            return true;
        } catch (Exception e) {
            System.out.println("\\u001B[31m REMOVE FAIL");
            return false;
        }


    }

    @Override
    public boolean remove(T anEntry) {
        if(contains(anEntry)){
            arrayBag.remove(anEntry);
            return true;
        }
        System.out.println("\\u001B[31m ADD FAIL");
        return false;
    }

    @Override
    public T remove() {
        Random rand = new Random();
        int randInt = rand.nextInt(getCurrentSize());
        return arrayBag.get(randInt);
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(T anEntry) {
        return arrayBag.contains(anEntry);
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int count = 0;
        for(T value: arrayBag){
            if(anEntry == value){
                count++;
            }
        }
        return count;
    }
}
