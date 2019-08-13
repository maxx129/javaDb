package ru.maxx129.dao;

import ru.maxx129.model.User;

import java.util.List;

public interface UsersDao extends CrudDao<User> {

    List<User> findAllByFirstName(String firstName);
}
