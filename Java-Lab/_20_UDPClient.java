import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class _20_UDPClient {
    public static void main(String[] args) {
        DatagramSocket socket = null;
        try {
            
            socket = new DatagramSocket();
            InetAddress serverAddress = InetAddress.getByName("localhost");
            int serverPort = 9876;

           
            String message = "Hello, Server!";
            byte[] sendData = message.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);
            socket.send(sendPacket);

            
            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            socket.receive(receivePacket);

            
            String responseMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Response from server: " + responseMessage);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null && !socket.isClosed()) {
                socket.close();
            }
        }
    }
}
