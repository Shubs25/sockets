package CSchat;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(6969);
        Socket s = ss.accept();

        DataInputStream reader = new DataInputStream(s.getInputStream());
        DataOutputStream writer = new DataOutputStream(s.getOutputStream());
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String msg = "", reply = "";

        while(!msg.equals("!END")) {
            msg = reader.readUTF();
            System.out.println("[CLIENT] " + msg);
            reply = input.readLine();
            writer.writeUTF(reply);
            writer.flush();
        }


        ss.close();
        s.close();
        reader.close();
        writer.close();
        input.close();



    }
}
