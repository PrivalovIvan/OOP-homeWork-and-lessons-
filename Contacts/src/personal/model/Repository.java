package src.personal.model;

import java.io.IOException;
import java.util.List;

public interface Repository {
    List<User> getAllUsers() throws IOException;

    String CreateUser(User user) throws IOException;

    User updateUser(User user) throws Exception;

    User readUser(String user) throws Exception;

    List<User> deleteUser(String user) throws Exception;
}
