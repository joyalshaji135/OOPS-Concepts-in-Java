import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class _20_UDPServer {
    public static void main(String[] args) {
        DatagramSocket socket = null;
        try {
            
            socket = new DatagramSocket(9876);
            byte[] buffer = new byte[1024];

            System.out.println("Server is listening on port 9876...");

            while (true) {
                
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                socket.receive(packet);

                
                String receivedMessage = new String(packet.getData(), 0, packet.getLength());
                System.out.println("Received: " + receivedMessage);

                
                String responseMessage = "Message received";
                byte[] responseData = responseMessage.getBytes();
                InetAddress clientAddress = packet.getAddress();
                int clientPort = packet.getPort();
                DatagramPacket responsePacket = new DatagramPacket(responseData, responseData.length, clientAddress, clientPort);
                socket.send(responsePacket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null && !socket.isClosed()) {
                socket.close();
            }
        }
    }
}
