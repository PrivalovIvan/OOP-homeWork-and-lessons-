package src.personal.model;

import java.io.IOException;
import java.util.List;

public class NotesDecorator implements Repository {
    private Repository repository;
    private Logger log;

    public NotesDecorator(Repository repository, Logger log) {
        this.repository = repository;
        this.log = log;
    }

    @Override
    public List<Notes> getAllNotes() throws IOException {
        List<Notes> res = repository.getAllNotes();
        return res;
    }

    @Override
    public String createNote(Notes note) throws IOException {
        log.Log("Создаем записку.");
        String res = repository.createNote(note);
        log.Log("Записка готова.\n");
        return res;
    }

    @Override
    public Notes updateNote(Notes note) throws Exception {
        log.Log("Изменяем записку...");
        Notes res = repository.updateNote(note);
        log.Log("Записка изменена.\n");
        return res;
    }

    @Override
    public Notes readNote(String note) throws Exception {
        log.Log("Чтение записки...");
        Notes res = repository.readNote(note);
        log.Log("Чтение записки закончено.\n");
        return res;
    }

    @Override
    public List<Notes> deleteNote(String note) throws Exception {
        log.Log("Начинаем удалять записку.");
        List<Notes> res = repository.deleteNote(note);
        log.Log("Записка удалена!\n");
        return res;

    }

    public void saveNote(Notes note) {
        try {
            repository.createNote(note);
            log.Log("Записка сохранена!\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Notes> readNoteList() throws IOException {
        log.Log("Читаем записки");
        List<Notes> res = repository.getAllNotes();
        log.Log("Прочитано.\n");
        return res;
    }
}
