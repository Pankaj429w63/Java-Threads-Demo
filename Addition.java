public class Addition implements Runnable {
    @Override
    public void run() {
        // Logic for addition
        int a = 10, b = 5;
        int result = a + b;
        System.out.println("Addition Result: " + result);
    }
}
