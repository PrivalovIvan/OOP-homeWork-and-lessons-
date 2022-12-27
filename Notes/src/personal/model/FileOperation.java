package src.personal.model;

import java.io.IOException;
import java.util.List;

public interface FileOperation {
    List<Notes> readAllLines() throws IOException;

    void saveAllLines(List<Notes> lines) throws IOException;
}
