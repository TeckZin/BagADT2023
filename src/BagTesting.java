public class BagTesting {

    public static void main(String[] args) {
        System.out.println("\033[0;96mBAG TESTING RUN");


        ArrayBag arrayBag = new ArrayBag();
        arrayBag.add(3);
        arrayBag.add("Hello");
        arrayBag.add("34");

        System.out.println(arrayBag.getCurrentSize());
        arrayBag.clear();
        System.out.println(arrayBag.getCurrentSize());

        System.out.println("\033[0;91mBAG TESTING EXITED");

    }
}