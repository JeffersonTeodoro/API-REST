package br.com.jefferson.taskmanager.application.input;

import br.com.jefferson.taskmanager.domain.TaskStatus;

import java.util.Optional;

public record UpdateTaskInput(Optional<String> title,
                              Optional<String> description,
                              Optional<TaskStatus> status) {
}
