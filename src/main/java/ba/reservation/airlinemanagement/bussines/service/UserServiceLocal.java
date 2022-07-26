package ba.reservation.airlinemanagement.bussines.service;

import ba.reservation.airlinemanagement.bussines.model.Client;
import ba.reservation.airlinemanagement.bussines.model.User;

import java.util.List;

public interface UserServiceLocal {

    User login(String username, String password);


    List<User> findAll();

    void create(User user);

    void edit(User user);

    void remove(User user);

    void removeById(Integer id);

    User find(Integer id);

    }


