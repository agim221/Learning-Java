package repository;

import entity.ToDoList;

public class ToDoListRepoImpl implements ToDoListRepo{

    public ToDoList[] data = new ToDoList[10];

    @Override
    public ToDoList[] getAll() {
        return data;
    }

    public boolean isFull() {
        var isFull = true;
        for(int i = 0; i < data.length; i++) {
            if(data[i] == null) {
                isFull = false;
                break;
            }
        }
        return isFull;
    }

    public void resizeIsFull() {
        if (isFull()) {
            var temp = data;
            data = new ToDoList[data.length * 2];

            for(int i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
        }
    }

    @Override
    public void add(ToDoList toDoList) {
        resizeIsFull();

        for(var i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = toDoList;
                break;
            }
        }
    }

    @Override
    public void remove(Integer index) {

    }
}
