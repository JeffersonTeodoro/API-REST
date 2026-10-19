package br.com.jefferson.taskmanager.application.output;

import br.com.jefferson.taskmanager.domain.Task;

import java.util.Optional;

public record TaskOutput(String id, String title, Optional<String> description, String status) {

    public static TaskOutput from(Task task) {
        return new TaskOutput(task.getId().id().toString(),
                task.getTitle(),
                task.getDescription(),
                task.getStatus().name());
    }
}
