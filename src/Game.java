import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    int amount = 4;
    ArrayBag<Integer> guesses = new ArrayBag<>();
    ArrayBag<Integer> arrayBag;

    private final Scanner sc = new Scanner(System.in);

    public Game(ArrayBag<Integer> arrayBag){
        System.out.println("\033[1;33mGame Started");
        this.arrayBag = arrayBag;
        Interaction();


    }

    private int Input(){
        try{
            return sc.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Only enter integer try again: ");
            return Input();
        }
    }

    private void Guess(){
        for(int i = 0; i < amount; i++){
            guesses.add(Input());
        }
        int correctGuesses = checkAllValue();
        if(correctGuesses == amount){
            End();
        } else {
            System.out.printf("%d of your guesses are correct\n", correctGuesses);
            Guess();
        }
    }

    private void Interaction(){
//        System.out.print("\033[1;37mEnter amount to guess: ");
//        this.amount = Input();
        System.out.printf("\033[0;97mEnter %d integers to guess:\n", amount);
        Guess();


    }


    private int checkAllValue(){
        int count = 0;
        for(int i = 0; i < guesses.getCurrentSize(); i++){
            int frequency= 0;
            int value = guesses.getValue(i);

            if(arrayBag.getValue(i) == value){
                int frequencyOfValue = guesses.getFrequencyOf(i);
                for(int idx = 0 ; idx < guesses.getCurrentSize(); idx++){
                    if(value == guesses.getValue(idx)) {
                        frequency++;
                    }

                }
                if(frequencyOfValue == frequency) {
                    count += frequencyOfValue;
                }
            }



        }

        return count;

    }

    private void End(){
        System.out.println("GAME END");
        return;
    }
}
