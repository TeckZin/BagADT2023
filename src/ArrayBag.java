import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class ArrayBag <T> implements BagInterface <T> {
    private ArrayList<T> arrayBag;
    private final  Random rand = new Random();

    public ArrayBag(){
        System.out.println("\u001B[34mArray Bag Created");
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
    public T getValue(int index) {
        return arrayBag.get(index);
    }

    @Override
    public boolean add(T newEntry) {

        try {
            arrayBag.add(newEntry);
            return true;
        } catch (Exception e) {
            System.out.println("\u001B[31m REMOVE FAIL");
            return false;
        }


    }

    @Override
    public boolean remove(T anEntry) {
        if(contains(anEntry)){
            System.out.println("Remove " + anEntry);
            arrayBag.remove(anEntry);
            return true;
        }
        System.out.println("\u001B[31m ADD FAIL");
        return false;
    }

    @Override
    public T remove() {
        try{
            int randInt = rand.nextInt(getCurrentSize());
            return arrayBag.get(randInt);
        } catch (Exception e){
            return null;
        }

    }



    @Override
    public void clear() {
        int size = arrayBag.size();
        for(int i = 0; i < size; i++){
            System.out.println( "removed: " + arrayBag.get(0));
            arrayBag.remove(0);
        }
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



    public void printArray(){
        for(T x : arrayBag){
            System.out.println(x);
        }
        return;
    }
}
