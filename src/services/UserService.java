package services;

import entity.User;

import java.util.HashMap;
import java.util.List;

public interface UserService {

    User getByFinCode(String finCode);

    boolean addUser(User u);

    boolean remove(String idIndex);

    boolean update(User u);

}
