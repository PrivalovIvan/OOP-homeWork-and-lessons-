package src.personal.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RepositoryFile implements Repository {
    private FileOperation fileOperation;

    public RepositoryFile(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public List<Notes> getAllNotes() throws IOException {
        List<Notes> lines = fileOperation.readAllLines();
        List<Notes> notes = new ArrayList<>();
        for (Notes line : lines) {
            notes.add(line);
        }
        return notes;
    }

    @Override
    public String createNote(Notes note) throws IOException {

        List<Notes> notes = getAllNotes();
        int max = 0;
        for (Notes item : notes) {
            int id = Integer.parseInt(item.getId());
            if (max < id) {
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        note.setId(id);
        notes.add(note);
        saveUsers(notes);
        return id;
    }

    private void saveUsers(List<Notes> notes) throws IOException {
        List<Notes> lines = new ArrayList<>();
        for (Notes item : notes) {
            lines.add(item);
        }
        fileOperation.saveAllLines(lines);
    }

    @Override
    public Notes updateNote(Notes note) throws Exception {
        List<Notes> notes = getAllNotes();
        Notes foundUser = findNoteById(notes, note.getId());
        foundUser.setHeader(note.getHeader());
        foundUser.setText(note.getText());
        saveUsers(notes);
        return foundUser;
    }

    @Override
    public Notes readNote(String noteId) throws Exception {
        List<Notes> notes = getAllNotes();
        return findNoteById(notes, noteId);
    }

    private Notes findNoteById(List<Notes> notes, String noteId) throws Exception {
        for (Notes user : notes) {
            if (user.getId().equals(noteId)) {
                return user;
            }
        }
        throw new Exception("Note not found");
    }

    @Override
    public List<Notes> deleteNote(String noteId) throws Exception {
        List<Notes> notes = getAllNotes();
        for (Notes user : notes) {
            if (user.getId().equals(noteId)) {
                notes.remove(user);
                saveUsers(notes);
            }
        }
        return notes;
    }
}
