import java.io.IOException;
import java.net.ServerSocket;
import java.net.*;

public class server {
    public static void main(String[] args) {
        ServerSocket s = null;
        try {
            s = new ServerSocket(3000);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Server waiting for connection....");
        try {
            Socket c = s.accept();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Connection established");
    }
}
