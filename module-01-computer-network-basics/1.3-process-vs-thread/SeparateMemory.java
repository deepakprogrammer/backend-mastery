public class SeparateMemory {
    static int value = 0;
    public static void main(String[] args)throws InterruptedException {
        if(args.length > 0) value = Integer.parseInt(args[0]);
        System.out.println("PID " + ProcessHandle.current().pid() + " sees value = " + value);
        Thread.sleep(5000);
    }
}
 