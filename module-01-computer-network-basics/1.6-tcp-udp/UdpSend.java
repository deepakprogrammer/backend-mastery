import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;

public class UdpSend {
    public static void main(String[] args)throws Exception {
        DatagramSocket socket = new DatagramSocket();
        byte[] data = "hello".getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getByName("localhost"), 9999);
        socket.send(packet);
        System.out.println("UDP: sent");
        socket.close();
    }
}
