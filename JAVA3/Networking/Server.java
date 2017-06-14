import java.io.IOException;
import java.net.DatagramSocket;
import java.net.*;

public class Server {

    public static void main(String[] args) {
        Server1 s = new Server1();
        s.waitForPackets();
    }
}

class Server1{
    public Server1(){


        try {
            socket = new DatagramSocket(5000);
        } catch (SocketException se) {
            se.printStackTrace();
            System.exit(1);
        }
    }
    public void waitForPackets()
    {
        while ( true )
        {
            try
            {
                //
                // Set up a packet
                //
                byte data[] = new byte[1024];
                recievePacket = new DatagramPacket( data,
                        data.length );
                //
                // Wait for packet
                //
                socket.receive( recievePacket );
                String str = new String(recievePacket.getData());
                int num = Integer.valueOf(str.trim());
                System.out.println("Recieved data: " + num);
            }
            catch(IOException ioe){
                ioe.printStackTrace();
                System.exit(2);
            }
        }
    }
    private DatagramPacket sendPacket,recievePacket;
    private DatagramSocket socket;

}
