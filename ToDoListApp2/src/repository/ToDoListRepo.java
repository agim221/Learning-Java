package repository;

import entity.ToDoList;

public interface ToDoListRepo {

    ToDoList[] getAll();

    void add(ToDoList toDoList);

    void remove(Integer index);


}
