package hiber.dao;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {
   void add(User user);

   List<User> listUsers();

   void addCar(Car car);

   Optional<Object> getUserByModelAndSeries(String model, int series);
}
