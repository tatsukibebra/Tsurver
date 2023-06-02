import java.net.Socket;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Socket server = socket("<<<IP SERVER>>>", 60606)) {
            TsurverClient tsurverClient = new TsurverClient(socket);
            System.out.println("Client started!");
            String username = "<<<USERNAME>>>";
            System.out.println(tsurverClient.reader.readLine());
            tsurverClient.writeLine(username);
            Scanner scnr = new Scanner(System.in);
            while(true) {
                tsurverClient.writeLine(scnr.nextLine());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}




