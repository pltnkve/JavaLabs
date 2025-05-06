package lab6;

public class Task6 {
    private static final Object lock = new Object();
    private static int sum = 0;

    public static void main(String[] args) throws InterruptedException {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numCores = Runtime.getRuntime().availableProcessors();
        int chunkSize = array.length / numCores;

        Thread[] threads = new Thread[numCores];
        for (int i = 0; i < numCores; i++) {
            int start = i * chunkSize;
            int end = (i == numCores - 1) ? array.length : (i + 1) * chunkSize;

            int finalI = i;
            threads[i] = new Thread(() -> {
                int localSum = 0;
                for (int j = start; j < end; j++) {
                    localSum += array[j];
                }
                synchronized (lock) {
                    sum += localSum;
                    System.out.println(threads[finalI].getName() + ": " + localSum);
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Сумма элементов: " + sum);
    }
}
