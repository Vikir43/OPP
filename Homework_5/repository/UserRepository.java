package Homework_5.repository;

import Homework_5.model.User;

import java.util.List;

public interface UserRepository<T extends User> {

    List<T> getAll();
    void add(T t);
    void remove(String name);
    Long getMaxId();

}
