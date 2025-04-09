public class Multiplication implements Runnable {
    @Override
    public void run() {
        // Logic for multiplication
        int a = 10, b = 5;
        int result = a * b;
        System.out.println("Multiplication Result: " + result);
    }
}
