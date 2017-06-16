import java.io.IOException;
import java.net.DatagramSocket;
import java.net.*;
import java.util.Random;

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
                Random rn = new Random();
                key = rn.nextInt(10 - 0 + 1) + 0;
                
                byte data[] = new byte[1024];
                recievePacket = new DatagramPacket( data,
                        data.length );
                
                socket.receive(recievePacket);
                String plaintext = new String(recievePacket.getData());
                plaintext.trim();
                // int key = Integer.valueOf(str.trim());
                System.out.println("Recieved data: " + plaintext);

                encryptMethod(plaintext.trim(), key);


                byte data2[] = (cipher + "").getBytes();
                sendPacket = new DatagramPacket(data2,data2.length,InetAddress.getLocalHost(),recievePacket.getPort());
                socket.send(sendPacket);
                String str2 = new String(sendPacket.getData());
                System.out.println("Data " + str2 + " Sent back to client...");

            }
            catch(IOException ioe){
                ioe.printStackTrace();
                System.exit(2);
            }
        }
    }

    public void encryptMethod(String text, int shiftKey){
        String plain = text.toLowerCase();
        cipher = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz1234567890";

        for (int i = 0; i < plain.length(); i++){
            int charPos = alphabet.indexOf(plain.charAt(i));
            int keyVal = (shiftKey + charPos) % 26;
            char replaceVal = alphabet.charAt(keyVal);
            cipher += replaceVal;
            }
        
        System.out.println("cipher text is" + " " + cipher); 

}

    private DatagramPacket sendPacket,recievePacket;
    private DatagramSocket socket;
    private byte[] data2;
    private int key;
    private Random rn;
    private String cipher;
}
