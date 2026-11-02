import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer{
    public static void main(String[] args)throws Exception{
        ServerSocket server = new ServerSocket(9999);
        System.out.println("Server: listening on port 9999");
        Socket client = server.accept();
        System.out.println("Server: client connected from " + client.getInetAddress().getHostAddress() + " : " + client.getPort());

        client.close();
        server.close();
    }
}