public interface BagInterface <T>{
    public int getCurrentSize();
    public boolean isEmpty();
    public T getValue(int index);
    public boolean add(T newEntry);
    public boolean remove(T anEntry);
    public T remove();
    public void clear();
    public boolean contains(T anEntry);
    public Object[] toArray();
    public int getFrequencyOf(T anEntry);

}
