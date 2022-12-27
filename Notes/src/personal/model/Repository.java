package src.personal.model;

import java.io.IOException;
import java.util.List;

public interface Repository {
    List<Notes> getAllNotes() throws IOException;

    String createNote(Notes note) throws IOException;

    Notes updateNote(Notes note) throws Exception;

    Notes readNote(String note) throws Exception;

    List<Notes> deleteNote(String note) throws Exception;
}
