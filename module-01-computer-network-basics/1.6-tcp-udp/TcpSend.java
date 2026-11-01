import java.net.Socket;

public class TcpSend {
    public static void main(String[] args)throws Exception{
        Socket socket = new Socket("localhost", 9999);
        System.out.println("TCP: connected");
        socket.close();
    }
}
