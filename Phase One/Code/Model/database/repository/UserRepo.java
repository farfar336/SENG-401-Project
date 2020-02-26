package database.repository;
import database.InterfaceUserDatabase;
import database.datatables.*;
import model.UserModel;

public class UserRepo implements InterfaceUserDatabase
{
    private UserTable userTable;

    public UserRepo()
    {
        userTable = new UserTable();
    }


    @Override
    public boolean addUser(UserModel user)
    {
        return false;
    }

    @Override
    public boolean removeUser(UserModel user)
    {
        return false;
    }

    @Override
    public boolean login(String username, String password)
    {
        return false;
    }

    @Override
    public boolean changeUsername(UserModel user, String newUsername)
    {
        return false;
    }

    @Override
    public boolean changePassword(UserModel user, String newPassword)
    {
        return false;
    }





    //Tests
    // TODO: ...Delete main later
    public static void main(String args[])
    {
        UserRepo db = new UserRepo();
        UserModel user = new UserModel("alyssa", "lee");

    }
}
