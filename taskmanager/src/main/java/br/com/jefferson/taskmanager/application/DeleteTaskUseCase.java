package br.com.jefferson.taskmanager.application;

import br.com.jefferson.taskmanager.domain.TaskId;
import br.com.jefferson.taskmanager.domain.TaskNotFoundException;
import br.com.jefferson.taskmanager.domain.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class  DeleteTaskUseCase {
    private final TaskRepository repository;

    public DeleteTaskUseCase(TaskRepository repository) {
        this.repository = repository;
    }

    public void execute(TaskId taskId) {
        if (repository.findById(taskId).isEmpty()) {
            throw new TaskNotFoundException(taskId);
        }
        repository.delete(taskId);
    }
}
