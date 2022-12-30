package src.personal.model;

import java.io.IOException;

public interface Loggable {
    void Log(String message) throws IOException;
}
