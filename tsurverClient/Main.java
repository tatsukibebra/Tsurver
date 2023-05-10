import java.net.Socket;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (Socket server = socket("<<There IP SERVER>>", 60606)) {
            System.out.println("Client started!");
            TsurverClient tsurverClient = new TsurverClient(socket);
            TsurverClienr.writLine()
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}




