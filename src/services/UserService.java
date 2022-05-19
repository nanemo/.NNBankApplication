package services;

import entity.User;

public interface UserService {

    User getByFinCode(String finCode);

    boolean addUser(User u);

}
