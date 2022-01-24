package kz.primesource.todoliist.repositories;

import kz.primesource.todoliist.models.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Tasks, Long> {

    Tasks findTasksById(Long id);

}
