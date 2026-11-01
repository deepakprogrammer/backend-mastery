import java.net.InetAddress;

public class Localhost {
    public static void main(String[] args) throws Exception {
        InetAddress address = InetAddress.getByName("localhost");
        System.out.println("localhost -> " + address.getHostAddress());
    }
}
