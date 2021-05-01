
package Question1;

import java.io.DataOutputStream;
import java.net.Socket;


public class CLientMessage {
    public static void main(String[] args) {
        try{
            
            Socket socket_s = new Socket("localhost", 007);
            
            DataOutputStream data_out = new DataOutputStream(socket_s.getOutputStream());
            
            data_out.writeUTF("Hello Ali Raza");
            
            
            data_out.flush();
            data_out.close();
            socket_s.close();
            
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    } 
}
