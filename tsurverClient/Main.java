import java.net.Socket;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (Socket server = socket("<<There IP SERVER>>", 60606)) {
            TsurverClient tsurverClient = new TsurverClient(socket);
            System.out.println("Client started!");
            BufferedReader brUsername = new BufferedReader(new FileReader(username.txt));
            String username = brUsername.readLine();
             System.out.println(tsurverClient.reader.readLine());
            TsurverClienr.writLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}




