package database;

import model.UserModel;

public interface InterfaceUserDatabase
{
    public boolean addUser(UserModel user);
    public boolean removeUser(UserModel user);
    public boolean login(String username, String password);
    public boolean changeUsername(UserModel user, String newUsername);
    public boolean changePassword(UserModel user, String newPassword);

}
