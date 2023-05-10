import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        try {
            Socket server = socket("<There IP SERVER>>", 60606);
            System.out.println("Server started!");
            TsurverClient tsurverClient = new Tsurver(socket);
            TsurverClienr.writeLine("Hello from Tsurver!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}




