package CSchat;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 6969);

        DataInputStream reader = new DataInputStream(s.getInputStream());
        DataOutputStream writer = new DataOutputStream(s.getOutputStream());
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String msg = "", reply = "";

        while(!msg.equals("!END")) {
            reply = input.readLine();
            writer.writeUTF(reply);
            writer.flush();
            msg = reader.readUTF();
            System.out.println("[CLIENT] " + msg);
        }


        s.close();
        reader.close();
        writer.close();
        input.close();



    }
}
