
package mid.paper;

import java.io.DataInputStream;
import java.net.Socket;

public class ServerSocket {
     public static void main(String[] args)  {
        try {
            java.net.ServerSocket server_s = new java.net.ServerSocket(007);
            
            System.out.println("wait for repsonse \n\n\n");
            Socket socket_s = server_s.accept();
            System.out.println(" Connection successfully \n\n\n");
            
            DataInputStream obj_1 = new DataInputStream(socket_s.getInputStream());
            String obj2 = (String) obj_1.readUTF();
            System.out.println("Notification is  = " + obj2);
            
            server_s.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
