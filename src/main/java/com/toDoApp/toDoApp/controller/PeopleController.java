package com.toDoApp.toDoApp.controller;

import com.toDoApp.toDoApp.entity.People;
import com.toDoApp.toDoApp.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
public class PeopleController {

    @Autowired
    private PeopleService peopleService;
    @GetMapping("/login")
    private People getCurrentUser(@RequestBody People people) {
        System.out.println("GET People by Peoplename and password *****");
        return peopleService.getUser(people);
    }

    @GetMapping("/login/{Peoplename}/{password}")
    private boolean findUserByUsername(@PathVariable String peopleName, @PathVariable String password) {
        System.out.println("GET People by Peoplename and password *****");
        return peopleService.getUserByUsername(peopleName, password);
    }

    @PostMapping("/createPeople")
    private boolean addUser(@RequestBody People people) {
        boolean people_exists = peopleService.findUserByUsername(people.getUsername());

        if(people_exists) {
            System.out.println("CANT CREATE People!");
            return false;
        }
        peopleService.saveUser(people);
        return true;
    }


}
