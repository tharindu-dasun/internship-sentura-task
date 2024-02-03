package lk.ijse.gdse.internshipsenturatask.service;

import org.apache.catalina.User;

import java.util.List;

public class UserService {
    void SaveUser();

    List<User> getAllUsers();

    User getUserById(String id);

    User updateUser(String id);

    void deleteUser(String id);
}
