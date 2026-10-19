package br.com.jefferson.taskmanager.application;

import br.com.jefferson.taskmanager.application.output.TaskOutput;
import br.com.jefferson.taskmanager.domain.TaskId;
import br.com.jefferson.taskmanager.domain.TaskNotFoundException;
import br.com.jefferson.taskmanager.domain.TaskRepository;
import org.springframework.stereotype.Service;


@Service
public class GetTaskByIdUseCase {
    private final TaskRepository repository;

    public GetTaskByIdUseCase(TaskRepository repository) {
        this.repository = repository;
    }

    public TaskOutput execute(TaskId id) {
        return repository.findById(id).map(TaskOutput::from).orElseThrow(() -> new TaskNotFoundException(id));
    }

}
