import java.net.Socket;

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




