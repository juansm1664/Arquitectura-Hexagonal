package com.juandavid.project.arquiHexagonal.domain.ports.in;

import com.juandavid.project.arquiHexagonal.domain.models.Task;

import java.util.Optional;

public interface UpdateTaskUseCase {
    Optional<Task> updateTask(Long id, Task updatedTask);
}
