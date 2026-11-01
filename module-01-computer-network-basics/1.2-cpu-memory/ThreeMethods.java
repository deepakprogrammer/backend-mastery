public class ThreeMethods {
    static void print(String level){
        Runtime r = Runtime.getRuntime();
        final long mb = 1024 * 1024;
        System.out.println(level);
        System.out.println(" max : " + r.maxMemory() / mb);
        System.out.println(" total : " + r.totalMemory() / mb);
        System.out.println(" free : " + r.freeMemory() / mb);
        System.out.println(" used : " + (r.totalMemory() - r.freeMemory()) / mb);
    }
    public static void main(String[] args) {
        print("Start");
        byte[] big = new byte[600 * 1024 * 1024];
        print("After creating 200 mb array");
    }
}
