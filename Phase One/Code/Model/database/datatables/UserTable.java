package database.datatables;

import database.InterfaceUserDatabase;
import database.SQLDatabase;
import model.UserModel;

import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

/**
 * Database user table storing information on
 */
public class UserTable extends SQLDatabase implements InterfaceUserDatabase
{
    public UserTable()
    {
        super();
        createUserTable();
    }

    /**
     * Creates a user table in the database if it does not exist
     */
    private void createUserTable()
    {
        try
        {
            DatabaseMetaData metaData = connection.getMetaData();
            ResultSet rs = metaData.getTables(null, null, "MangoUser", null);

            if (rs.next() == false)
            {
                String query = "CREATE TABLE MangoUser " +
                        "(IDNum VARCHAR(255) NOT NULL," +
                        "Fname VARCHAR(255) NOT NULL," +
                        "LName VARCHAR(255) NOT NULL," +
                        "Username VARCHAR(255) NOT NULL," +
                        "Password VARCHAR(255) NOT NULL," +
                        "PRIMARY KEY (IDNum)," +
                        "UNIQUE(Username) )";
                statement.executeUpdate(query);
                System.out.println("Created user table\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Adds a user to the database
     * @param user
     * @return
     */
    public boolean addUser(UserModel user)
    {
        try
        {
            String query = "INSERT INTO MangoUser (IDNum, Fname, Lname, Username, Password)" +
                    "VALUES (?, ?, ?, ?, ?, ?);";
            PreparedStatement pState = connection.prepareStatement(query);
            pState.setString(1, UUID.randomUUID().toString());       //TODO: Maybe add UUID, fname, and lname to UserModel instead of generating it here
            pState.setString(2, "firstname");                       //TODO: Change these firstname, lastname placeholders
            pState.setString(3, "lastname");
            pState.setString(4, user.getUsername());
            pState.setString(5, user.getPassword());
            pState.execute();
            return true;
        } catch (SQLException e)
        {
            e.printStackTrace();
            return false;
        }
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


}
