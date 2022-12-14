package src.personal.model;

import java.io.IOException;
import java.util.List;

public interface FileOperation {
    List<User> readAllLines() throws IOException;

    void saveAllLines(List<User> lines) throws IOException;
    // void saveAllLines(List<String> lines) throws IOException;
}
