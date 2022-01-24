package kz.primesource.todoliist.services.Impl;

import kz.primesource.todoliist.models.Tasks;
import kz.primesource.todoliist.repositories.TaskRepository;
import kz.primesource.todoliist.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Tasks getById(Long id) {
        return taskRepository.findTasksById(id);
    }

    @Override
    public List<Tasks> getAll() {
        return taskRepository.findAll();
    }

    @Override
    public Tasks createOrUpdateTask(Tasks tasks) {
        return taskRepository.save(tasks);
    }

    @Override
    public Tasks delete(Tasks tasks) {
        return taskRepository.save(tasks);
    }

}
