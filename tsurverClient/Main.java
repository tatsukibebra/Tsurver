import java.net.ServerSocket;

public class Main {
    public static void main(String[] args) {
        try {
            ServerSocket server = new          ServerSocket(60606);
            System.out.println("Server started!");
            Tsurver tsurver = new Tsurver(server);
            tsurver.writeLine("Hello from Tsurver!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
