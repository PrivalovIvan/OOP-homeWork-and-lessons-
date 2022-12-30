package src.personal;

import src.personal.model.FileOperation;
import src.personal.model.FileOperationJson;
import src.personal.model.Logger;
import src.personal.model.NotesDecorator;
import src.personal.model.Repository;
import src.personal.model.RepositoryFile;
import src.personal.views.ViewNote;

public class Main {
    public static void main(String[] args) {
        // FileOperation fileOperation = new FileOperationJson("Notes.txt");
        FileOperation fileOperation = new FileOperationJson("Notes.json");
        Repository repository = new RepositoryFile(fileOperation);
        NotesDecorator controller = new NotesDecorator(repository, new Logger("log.txt"));
        ViewNote view = new ViewNote(controller);
        view.run();
    }
}
