import java.lang.reflect.Array;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Game {
    int amount;
    private ArrayBag<Integer> guesses = new ArrayBag<>();
    private Random rand = new Random();
    private ArrayBag<Integer> arrayBag;

    private final Scanner sc = new Scanner(System.in);

    public Game(){
        System.out.println("\033[1;33mGame Started");
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
            System.out.printf("%d of your guesses are incorrect\n", correctGuesses);
            Guess();
        }
    }

    private void Interaction(){
        System.out.print("\033[1;37mEnter amount to guess: ");
        this.amount = Input();
        randomNumberListGen();
        System.out.printf("\033[0;97mEnter %d integers to guess:\n", amount);
        Guess();


    }


    private int checkAllValue(){
        int count = 0;
        ArrayBag<Integer> madeGuess = new ArrayBag<>();
        for(int actualIdx = 0; actualIdx < amount; actualIdx++){
            int actual = arrayBag.getValue(actualIdx);


            for(int guessIdx = 0; guessIdx < amount; guessIdx++){
                int guess = guesses.getValue(guessIdx);

                System.out.printf("Actual: %d, Guess: %d\n", actual, guess);

                if((actual == guess) && !madeGuess.contains(actual)){
                    madeGuess.add(guess);
                    System.out.printf("Test 1: Pass\n", actual, guess);

                    int guessFrequency= guesses.getFrequencyOf(guessIdx);
                    int actualFrequency = arrayBag.getFrequencyOf(actualIdx);

                    System.out.printf("ActualFre: %d, GuessFre %d\n", actualFrequency, guessFrequency);
                    if(guessFrequency == actualFrequency){
                        count += guessFrequency;
                    } else if (actualFrequency > guessFrequency){
                        count += amount - guessFrequency;
                    } else if(guessFrequency > actualFrequency){
                        count += amount - actualFrequency;
                    }

                }
            }
        }
        return count;

    }



    private ArrayBag<Integer> randomNumberListGen(){
        this.arrayBag = new ArrayBag<Integer>();
        for(int i = 0; i < amount; i++){
            arrayBag.add(randomNumberGen(rand));
        }

        arrayBag.printArray();
        return arrayBag;
    }

    private int randomNumberGen(Random rand){
        return rand.nextInt(9);

    }

    private void End(){
        System.out.println("GAME END");
        return;
    }
}
