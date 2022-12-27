package src.personal;

import src.personal.controllers.NoteController;
import src.personal.model.FileOperation;
import src.personal.model.FileOperationJson;
import src.personal.model.Repository;
import src.personal.model.RepositoryFile;
import src.personal.views.ViewNote;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationJson("Notes.json");
        Repository repository = new RepositoryFile(fileOperation);
        NoteController controller = new NoteController(repository);
        ViewNote view = new ViewNote(controller);
        view.run();
    }
}
