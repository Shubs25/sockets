package simple-client-server;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 6969);

        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        dos.writeUTF("Hey, what's up?");

        dos.close();
        s.close();

    }
}
