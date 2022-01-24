package kz.primesource.todoliist.services;

import kz.primesource.todoliist.models.Tasks;

import java.util.List;

public interface TaskService {
    Tasks getById(Long id);

    List<Tasks> getAll();

    Tasks createOrUpdateTask(Tasks tasks);

    Tasks delete(Tasks tasks);
}
