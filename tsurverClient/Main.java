import java.net.ServerSocket;

public class Main {
    public static void main(String[] args) {
        try {
            ServerSocket server = new          ServerSocket("<<СЮДА АЙПИШНИК>>", 60606);
            System.out.println("Server started!");
            TsurverClient tsurverClient = new Tsurver(socket);
            TsurverClienr.writeLine("Hello from Tsurver!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
