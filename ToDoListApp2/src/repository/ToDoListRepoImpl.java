package repository;

import entity.ToDoList;

public class ToDoListRepoImpl implements ToDoListRepo{

    public ToDoList[] data = new ToDoList[10];

    @Override
    public ToDoList[] getAll() {
        return data;
    }

    @Override
    public void add(ToDoList toDoList) {

    }

    @Override
    public void remove(Integer index) {

    }
}
