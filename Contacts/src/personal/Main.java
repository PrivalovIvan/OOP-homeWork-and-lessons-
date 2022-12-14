package src.personal;

import src.personal.controllers.UserController;
import src.personal.model.FileOperation;
// import src.personal.model.FileOperationImpl;
import src.personal.model.FileOperationJson;
import src.personal.model.Repository;
import src.personal.model.RepositoryFile;
import src.personal.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationJson("contacts.json");
        // FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
