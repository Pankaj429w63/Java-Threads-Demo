public class Division implements Runnable {
    @Override
    public void run() {
        // Logic for division
        int a = 10, b = 5;
        if (b != 0) {
            int result = a / b;
            System.out.println("Division Result: " + result);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}
