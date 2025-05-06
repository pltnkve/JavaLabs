package lab6;

public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(() -> System.out.println(Thread.currentThread().getName()));

            t.start();
            t.join();
        }
    }
}
