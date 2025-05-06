package lab6;

public class Task5 {
    private static final Object lock = new Object();
    private static int max = 0;

    public static void main(String[] args) throws InterruptedException {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int chunkSize = array.length / 4;

        Thread[] threads = new Thread[4];
        for (int i = 0; i < 4; i++) {
            int start = i * chunkSize;
            int end = (i == 4 - 1) ? array.length : (i + 1) * chunkSize;
            int finalI = i;
            threads[i] = new Thread(() -> {
                int localMax = 0;
                for (int j = start; j < end; j++) {
                    if (array[j] > localMax) {
                        localMax = array[j];
                    }
                }
                synchronized (lock) {
                    if (localMax > max) {
                        max = localMax;
                        System.out.println(threads[finalI].getName()
                                + ": " + localMax);
                    }
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Максимальный элемент: " + max);
    }
}
