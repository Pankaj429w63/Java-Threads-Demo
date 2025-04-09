/*
Name: Pankaj Yadav
PRN: 23070126166
Batch: AIML B2(23-27)
*/

public class Main {
    public static void main(String[] args) {
        // Creating thread objects for each operation
        Thread additionThread = new Thread(new Addition());
        Thread subtractionThread = new Thread(new Subtraction());
        Thread multiplicationThread = new Thread(new Multiplication());
        Thread divisionThread = new Thread(new Division());

        // Starting all threads
        additionThread.start();
        subtractionThread.start();
        multiplicationThread.start();
        divisionThread.start();
    }
}
