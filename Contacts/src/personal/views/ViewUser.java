package src.personal.views;

import java.util.List;
import java.util.Scanner;

import src.personal.controllers.UserController;
import src.personal.model.User;

public class ViewUser {

    private UserController userController;

    public ViewUser(UserController userController) {
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
                        userController.saveUser(setUser(false));
                        break;
                    case READ:
                        String id = prompt("Идентификатор пользователя: ");
                        User user = userController.readUser(id);
                        System.out.println(user);
                        break;
                    case LIST:
                        List<User> listUser = userController.readUserList();
                        listUser.forEach(System.out::println);
                        break;
                    case UPDATE:
                        User updateUser = setUser(true);
                        userController.updateUser(updateUser);
                        break;
                    case DELETE:
                        String deleteUser = prompt("id: ");
                        userController.deleteUser(deleteUser);
                        break;
                }
            } catch (Exception e) {
                System.out.println(e + " тут");
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private User setUser(boolean forUpdate) {
        String id = "0";
        if (forUpdate) {
            id = prompt("id: ");
        }
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");
        if (forUpdate) {
            return new User(id, firstName, lastName, phone);
        }
        return new User(firstName, lastName, phone);

    }
}
