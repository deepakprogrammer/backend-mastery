public class SharedMemory {
    static int value = 0;
    public static void main(String[] args)throws InterruptedException {
        Thread worker = new Thread(() -> value = 42,"worker");
        worker.start();
        worker.join();
        System.out.println("main sees value = " + value);
    }
}
