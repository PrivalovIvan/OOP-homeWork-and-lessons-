package src.personal.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RepositoryFile implements Repository {
    // private UserMapper mapper = new UserMapper();
    private FileOperation fileOperation;

    public RepositoryFile(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public List<User> getAllUsers() throws IOException {
        List<User> lines = fileOperation.readAllLines();
        List<User> users = new ArrayList<>();
        for (User line : lines) {
            users.add(line);
            // users.add(mapper.map(line));
        }
        return users;
    }

    @Override
    public String CreateUser(User user) throws IOException {

        List<User> users = getAllUsers();
        int max = 0;
        for (User item : users) {
            int id = Integer.parseInt(item.getId());
            if (max < id) {
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        user.setId(id);
        users.add(user);
        saveUsers(users);
        return id;
    }

    private void saveUsers(List<User> users) throws IOException {
        List<User> lines = new ArrayList<>();
        for (User item : users) {
            lines.add(item);
        }
        fileOperation.saveAllLines(lines);
    }
    // private void saveUsers(List<User> users) throws IOException {
    // List<String> lines = new ArrayList<>();
    // for (User item : users) {
    // lines.add(mapper.map(item));
    // }
    // fileOperation.saveAllLines(lines);
    // }

    @Override
    public User updateUser(User user) throws Exception {
        List<User> users = getAllUsers();
        User foundUser = findUserById(users, user.getId());
        foundUser.setFirstName(user.getFirstName());
        foundUser.setLastName(user.getLastName());
        foundUser.setPhone(user.getPhone());
        saveUsers(users);
        return foundUser;
    }

    @Override
    public User readUser(String userId) throws Exception {
        List<User> users = getAllUsers();
        return findUserById(users, userId);
    }

    private User findUserById(List<User> users, String userId) throws Exception {
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }
        throw new Exception("User not found");
    }

    @Override
    public List<User> deleteUser(String userId) throws Exception {
        List<User> users = getAllUsers();
        for (User user : users) {
            if (user.getId().equals(userId)) {
                users.remove(user);
                saveUsers(users);
            }
        }
        return users;
    }
}
