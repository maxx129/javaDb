package ru.maxx129.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import ru.maxx129.model.User;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class UsersDaoJdbcTemplateImpl implements UsersDao {

    private JdbcTemplate template;
    //language = SQL
    private final String SQL_SELECT_ALL = "SELECT * FROM users";
    //language = SQL
    private final String SQL_SELECT_USERS_WITH_CARS = "SELECT * FROM users LEFT JOIN cars ON users.id = cars.owner_id WHERE users.id = ?";
    //language = SQL
    private final String SQL_SELECT_ALL_BY_FIRST_NAME = "SELECT * FROM users WHERE first_name = ?";

    private Map<Integer, User> userMap = new HashMap<>();

    public UsersDaoJdbcTemplateImpl(DataSource dataSource) {
        this.template = new JdbcTemplate(dataSource);
    }


    private RowMapper<User> userRowMapper = (ResultSet resultSet, int i) -> {
        return new User(
                resultSet.getInt("id"),
                resultSet.getString("first_name"),
                resultSet.getString("last_name"));
    };



    public List<User> findAll() {

        return template.query(SQL_SELECT_ALL, userRowMapper);
    }



    public List<User> findAllByFirstName(String firstName) {

        return template.query(SQL_SELECT_ALL_BY_FIRST_NAME, userRowMapper, firstName);
    }





    public Optional<User> find(Integer id) {
        return Optional.empty();
    }

    public void save(User model) {

    }

    public void update(User model) {

    }

    public void delete(Integer id) {

    }


}
