package inter;

import entity.User;

import java.util.HashMap;

public interface UserInter {

    public HashMap<Integer, Integer> getAll();

    public User getByIdIndex(String idIndex);

    public User addUser(User u);

    public User remove(String idIndex);

    public User update(User u);


}
