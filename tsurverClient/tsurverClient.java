import java.io.*;
import java.net.*;

class TsurverClient {

    private final BufferedReader reader;
    private final BufferedWriter writer;
    Tsurver(Socket socket) {
        try {
            this.reader = createReader();
            this.writer = createWriter();
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void writeLine(String message) {
        try {
            writer.write(message);
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private BufferedReader createReader() throws IOException {
        return new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }
    private BufferedWriter createWriter() throws IOException {
        return new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
    }
    public void close () throws IOException {
        socket.close();
        reader.close();
        writer.close();
    }
}
