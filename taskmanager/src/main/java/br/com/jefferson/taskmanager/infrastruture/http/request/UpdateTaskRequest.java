package br.com.jefferson.taskmanager.infrastruture.http.request;

import br.com.jefferson.taskmanager.application.input.UpdateTaskInput;
import br.com.jefferson.taskmanager.domain.TaskStatus;

import java.util.Optional;

public record UpdateTaskRequest(
        Optional<String> title,
        Optional<String> description,
        Optional<String> status
) {
    public UpdateTaskInput toInput() {
        return new UpdateTaskInput(title, description, status.map(TaskStatus::valueOf));
    }
}
