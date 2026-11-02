import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceive{
    public static void main(String[] args)throws Exception {
        DatagramSocket socket = new DatagramSocket(9999);
        System.out.println("Receiver: waiting on port 9999");
        byte[] buffer = new byte[100];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        socket.receive(packet);
        String message = new String(packet.getData(),0, packet.getLength());
        System.out.println("Receiver: got '" + message + "' from " + packet.getAddress().getHostAddress() + " : " + packet.getPort());
        socket.close();
    }
}