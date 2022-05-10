package services;

import entity.User;

import java.util.HashMap;

public interface UserService {

    User getByIdIndex(Integer idIndex);

    boolean addUser(User u);

    boolean remove(String idIndex);

    boolean update(User u);

}
