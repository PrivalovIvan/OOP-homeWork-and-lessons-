package src.personal.model;

import java.io.FileWriter;
import java.io.IOException;

public class Logger implements Loggable {
    String fileName;

    public Logger(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void Log(String message) throws IOException {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.append(message + "\n");
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
