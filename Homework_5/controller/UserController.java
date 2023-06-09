package Homework_5.controller;

import Homework_5.model.User;

import java.util.List;

public interface UserController<T extends User>  {

    void create(String fullName, Integer age, String phoneNumber);
    void createRandom(Integer quantity);
    List<T> getAllUsersSortedByFirstName();
    List<T> getAllUsersSortedByLastName();
    List<T> getAllUsersSortedByAge();
    List<T> getAllUsersSortedById();
    boolean remove(String fullName);
    List<T> getAll();
    void edit(String fullName, Integer age, String phoneNumber);

}
