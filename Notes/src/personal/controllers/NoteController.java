package src.personal.controllers;

import java.io.IOException;
import java.util.List;

import src.personal.model.Repository;
import src.personal.model.Notes;

public class NoteController {
    private final Repository repository;

    public NoteController(Repository repository) {
        this.repository = repository;
    }

    public void saveNote(Notes note) throws Exception {
        validateNote(note);
        repository.createNote(note);
    }

    public Notes readNote(String noteId) throws Exception {
        return repository.readNote(noteId);
    }

    public List<Notes> readNoteList() throws IOException {
        return repository.getAllNotes();
    }

    public Notes updateNote(Notes note) throws Exception {
        validateNote(note);
        return repository.updateNote(note);
    }

    private void validateNote(Notes note) throws Exception {
        if (note.getHeader().isEmpty()) {
            throw new Exception("Отсутствует заголовок!");
        }
        if (note.getText().isEmpty()) {
            throw new Exception("Отсутствует текст!");
        }

    }

    public List<Notes> deleteNote(String noteId) throws Exception {
        repository.deleteNote(noteId);
        return repository.getAllNotes();
    }
}
