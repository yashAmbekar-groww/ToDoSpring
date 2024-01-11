package com.toDoApp.toDoApp.repositories;

import com.toDoApp.toDoApp.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends JpaRepository<People, Integer> {
    People findByUsernameAndPassword(String username, String password);
    People findTopByUsername(String username);
    People findTopByPassword(String password);
}
