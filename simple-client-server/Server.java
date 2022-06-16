package some_folder;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(6969);
        Socket s = ss.accept();

        DataInputStream dis = new DataInputStream(s.getInputStream());
        System.out.println(dis.readUTF());

        dis.close();
        s.close();
        ss.close();

    }
}
