package service;

import entity.ToDoList;
import repository.ToDoListRepo;

public class ToDoListServImp implements ToDoListServ{

    private ToDoListRepo toDoListRepo;

    public ToDoListServImp(ToDoListRepo toDoListRepo) {
        this.toDoListRepo = toDoListRepo;
    }
    @Override
    public void showToDoList() {
        ToDoList[] model = toDoListRepo.getAll();

        System.out.println("TODOLIST");
        for (var i = 0; i < model.length;i++) {
            var todo = model[i];
            var no = i + 1;

            if(todo != null) {
                System.out.println(no + ". " + todo.getToDo());
            }
        }
    }

    @Override
    public void addToDoList() {

    }

    @Override
    public void removeToDoList() {

    }
}
