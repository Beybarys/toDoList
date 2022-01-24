package kz.primesource.todoliist.rest;

import kz.primesource.todoliist.models.Tasks;
import kz.primesource.todoliist.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping(path = "/tasks/{id}")
    public Tasks getById(@PathVariable("id") Long id) {
        return taskService.getById(id);
    }

    @PostMapping(path = "/tasks")
    public Tasks create(@RequestBody Tasks tasks) {
        return taskService.createOrUpdateTask(tasks);
    }

    @PutMapping(path = "/tasks/{id}")
    public Tasks update(@RequestBody Tasks tasks) {
        return taskService.createOrUpdateTask(tasks);
    }

    @DeleteMapping(path = "/tasks/{id}")
    public Tasks delete(@PathVariable Long id) {
        Tasks tasks = taskService.getById(id);
        return taskService.delete(tasks);
    }

    @GetMapping(path = "/tasks")
    public List<Tasks> getAll() {
        return taskService.getAll();
    }
}
