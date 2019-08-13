package ru.maxx129.dao;

import ru.maxx129.model.User;
import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UsersDaoJdbcImpl implements UsersDao {


    //language = SQL
    private final String SQL_SELECT_ALL = "SELECT * FROM users";

    //language = SQL
    private final String SQL_SELECT_BY_ID = "SELECT * FROM users WHERE id = ?";

    private Connection connection;

    public UsersDaoJdbcImpl(DataSource dataSource) {

        try {
            this.connection = dataSource.getConnection();
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }



    public List<User> findAllByFirstName(String firstName) {
        return null;
    }



    public Optional<User> find(Integer id) {

        try {
            PreparedStatement statement = connection.prepareStatement(SQL_SELECT_BY_ID);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");

                return Optional.of(new User(id, firstName, lastName));
            }

            return Optional.empty();

        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }






    public List<User> findAll() {

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_SELECT_ALL);

            List<User> users = new ArrayList<User>();

            while (resultSet.next()) {
                Integer id = resultSet.getInt("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");

                User user = new User(id, firstName, lastName);

                users.add(user);
            }

            return users ;

        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }



    }


    public void save(User model) {

    }

    public void update(User model) {

    }

    public void delete(Integer id) {

    }
}
