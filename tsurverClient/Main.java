import java.net.Socket;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

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




