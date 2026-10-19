package br.com.jefferson.taskmanager.infrastruture.repository;

import br.com.jefferson.taskmanager.domain.TaskRepository;
import br.com.jefferson.taskmanager.domain.TaskRepositoryTest;

public class InMemoryTaskRepositoryTest extends TaskRepositoryTest {

    @Override
    protected TaskRepository createRepository() {
        return new InMemoryTaskRepository();
    }
}