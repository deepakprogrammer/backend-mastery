public class Switching {
    static void work(String name){
        for(int step = 1; step <= 5; ++step){
            long sum = 0;
            for(long i = 0; i < 400_000_000L; ++i) sum += i % 7;
            System.out.println(name + " step " + step +  " ( " + sum % 10  + " ) ");
        }
    }
    public static void main(String[] args) throws InterruptedException{
        long start = System.currentTimeMillis();
        Thread a = new Thread(() -> work("A"));
        Thread b = new Thread(() -> work("B"));
        a.start();
        b.start();
        a.join();
        b.join();
        System.out.println("Total time (ms): " +  (System.currentTimeMillis() - start));
    }
}