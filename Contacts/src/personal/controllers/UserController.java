package src.personal.controllers;

import java.io.IOException;
import java.util.List;

import src.personal.model.Repository;
import src.personal.model.User;

public class UserController {
    private final Repository repository;

    public UserController(Repository repository) {
        this.repository = repository;
    }

    public void saveUser(User user) throws Exception {
        validateUSer(user);
        repository.CreateUser(user);
    }

    public User readUser(String userId) throws Exception {
        return repository.readUser(userId);
    }

    public List<User> readUserList() throws IOException {
        return repository.getAllUsers();
    }

    public User updateUser(User user) throws Exception {
        validateUSer(user);
        return repository.updateUser(user);
    }

    private void validateUSer(User user) throws Exception {
        if (user.getFirstName().isEmpty()) {
            throw new Exception("Отсутствует имя!");
        }
        if (user.getLastName().isEmpty()) {
            throw new Exception("Отсутствует фамилия!");
        }
        if (user.getPhone().isEmpty()) {
            throw new Exception("Отсутствует телефон!");
        }
    }

    public List<User> deleteUser(String userId) throws Exception {
        repository.deleteUser(userId);
        return repository.getAllUsers();
    }
}
