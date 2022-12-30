package src.personal.views;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import src.personal.model.Notes;
import src.personal.model.NotesDecorator;

public class ViewNote {

    // private NoteController userController;
    private NotesDecorator userController;

    // public ViewNote(NoteController userController) {
    // this.userController = userController;
    // }
    public ViewNote(NotesDecorator userController) {
        this.userController = userController;
    }

    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            String command = prompt("Введите команду: ");
            try {
                com = Commands.valueOf(command);
            } catch (IllegalArgumentException e) {
                System.out.println("Неопознанная команда");
            }
            if (com == Commands.EXIT)
                return;
            try {
                switch (com) {
                    case CREATE:
                        userController.saveNote(setNote(false));
                        break;
                    case READ:
                        String id = prompt("Идентификатор письма: ");
                        Notes user = userController.readNote(id);
                        System.out.println(user);
                        break;
                    case LIST:
                        List<Notes> listUser = userController.readNoteList();
                        listUser.forEach(System.out::println);
                        break;
                    case UPDATE:
                        Notes updateUser = setNote(true);
                        userController.updateNote(updateUser);
                        break;
                    case DELETE:
                        String deleteUser = prompt("id: ");
                        userController.deleteNote(deleteUser);
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private Notes setNote(boolean forUpdate) {
        String id = "0";
        if (forUpdate) {
            id = prompt("id: ");
        }
        Date date = new Date();
        String header = prompt("Заголовок: ");
        String text = prompt("Текст: ");
        if (forUpdate) {
            return new Notes(id, date, header, text);
        }
        return new Notes(date, header, text);

    }
}
