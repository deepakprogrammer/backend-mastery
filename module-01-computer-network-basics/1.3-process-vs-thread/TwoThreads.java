public class TwoThreads {
    public static void main(String[] args)throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " | PID " + ProcessHandle.current().pid());
        Runnable task = () -> System.out.println(Thread.currentThread().getName() + " PID "+ ProcessHandle.current().pid());
        Thread worker = new Thread(task,"worker");
        worker.start();
        worker.join();
    }
}
