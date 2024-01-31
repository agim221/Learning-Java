package test.service;

import entity.ToDoList;
import repository.ToDoListRepoImpl;
import service.ToDoListServImp;
import service.ToDoListServ;

public class ToDoListServTest {
    public static void main(String[] args) {
        testShowToDoList();
    }

    public static void testShowToDoList() {
        ToDoListRepoImpl toDoListRepo = new ToDoListRepoImpl();
        toDoListRepo.data[0] = new ToDoList("Belajar Java Dasar");
        toDoListRepo.data[1] = new ToDoList("Belajar Java OOP");
        toDoListRepo.data[2] = new ToDoList("Belajar Java Standard Class");

        ToDoListServ toDoListServ = new ToDoListServImp(toDoListRepo);

        toDoListServ.showToDoList();
    }
}
