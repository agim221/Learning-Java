package belajar.java.junit.repository;

import belajar.java.junit.data.Person;

public interface PersonRepository {

    Person selectById(String id);
}
