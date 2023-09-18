public class BagTesting {

    public BagTesting(){
        System.out.println("\033[0;96mBAG TESTING RUN");
        System.out.println("\033[0;91mBAG TESTING EXITED");

        ArrayBag arrayBag = new ArrayBag();
        arrayBag.add(3);
        arrayBag.add("Hello");
        System.out.println(arrayBag.getCurrentSize());

    }
}