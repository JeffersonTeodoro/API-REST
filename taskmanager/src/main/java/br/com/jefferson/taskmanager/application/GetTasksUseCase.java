package br.com.jefferson.taskmanager.application;

import br.com.jefferson.taskmanager.application.output.TaskOutput;
import br.com.jefferson.taskmanager.domain.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetTasksUseCase {
    private final TaskRepository repository;

    public GetTasksUseCase(TaskRepository repository) {
        this.repository = repository;
    }

    public List<TaskOutput> execute() {
        return repository.findAll().stream()
                .map(TaskOutput::from)
                .toList();
    }
}
