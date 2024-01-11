//package com.toDoApp.toDoApp.service;
//
//
//import com.toDoApp.toDoApp.entity.Task;
//import com.toDoApp.toDoApp.repositories.TasksRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class TaskService {
//    //GET
//    private TasksRepository tasksRepository;
//
//    @Autowired
//    public TaskService(TasksRepository tasksRepository){
//        this.tasksRepository = tasksRepository;
//    }
//
//    public List<Task> getTasks(){
//        return tasksRepository.findAll();
//    }
//
//    public Task getTasksById(Integer id){
//        return tasksRepository.findById(id).orElse(null);
//    }
//
//    public Task getTasksByName(String name){
//        return tasksRepository.findByName(name);
//    }
//
//    public List<Task> getTasksFromUser(String username){
//        return tasksRepository.findAllByUsername(username);
//    }
//
//
//    //POST
//    public Task saveTask(Task task) {
//        System.out.println(task.toString());
//        return tasksRepository.save(task);
//    }
//
//    //PUT
//    public Task updateTask(Task task) {
//        System.out.println("updates");
//        Task existing_task = tasksRepository.findById(task.getId()).orElse(null);
//        existing_task.setName(task.getName());
//        existing_task.setDescription(task.getDescription());
//        existing_task.setStatus(task.getStatus());
//        return tasksRepository.save(existing_task);
//    }
//
//    //DELETE
//    public String deleteTask(int id) {
//        tasksRepository.deleteById(id);
//        return id + " id -> course removed/completed";
//    }
//
//}
