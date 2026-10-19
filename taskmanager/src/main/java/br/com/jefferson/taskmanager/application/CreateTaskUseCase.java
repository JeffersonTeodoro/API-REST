package br.com.jefferson.taskmanager.application;

import br.com.jefferson.taskmanager.application.input.CreateTaskInput;
import br.com.jefferson.taskmanager.application.output.TaskOutput;
import br.com.jefferson.taskmanager.domain.Task;
import br.com.jefferson.taskmanager.domain.TaskRepository;
import org.springframework.stereotype.Service;


@Service
public class CreateTaskUseCase {
    private final TaskRepository repository;

    public CreateTaskUseCase(TaskRepository repository) {
        this.repository = repository;
    }

    public TaskOutput execute(CreateTaskInput input) {
       var task = new Task(input.title(), input.description());
       var saved = repository.save(task);
       return TaskOutput.from(saved);
    }
}
