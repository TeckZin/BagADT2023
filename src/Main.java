import java.lang.reflect.Array;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("\033[4;92mMAIN IS RUNNING");
        Random rand = new Random();

        BagTesting bT = new BagTesting();

        ArrayBag<Integer> arrayBag = randomNumberListGen(rand, 4);
        for(int i = 0; i < arrayBag.getCurrentSize(); i++){
            System.out.println(arrayBag.getValue(i));

        }



        System.out.println("\033[4;92mSYSTEM EXIT");
    }

    private static ArrayBag<Integer> randomNumberListGen(Random rand, int m){
        ArrayBag<Integer> arrayBag = new ArrayBag<Integer>();
        for(int i = 0; i < m; i++){
            arrayBag.add(randomNumberGen(rand));
        }
        return arrayBag;
    }

    private static int randomNumberGen(Random rand){
        return rand.nextInt(9);

    }
}