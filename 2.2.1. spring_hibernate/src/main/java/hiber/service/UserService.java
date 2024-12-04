package hiber.service;

import hiber.model.User;

import java.util.List;
import java.util.Optional;


public interface UserService {
    Optional<Object> carOwner(String model, int series);

    User add(User user);

    List<User> listUsers();

}