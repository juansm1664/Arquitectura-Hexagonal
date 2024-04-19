package com.juandavid.project.arquiHexagonal.domain.ports.in;

import com.juandavid.project.arquiHexagonal.domain.models.Task;

import java.util.List;
import java.util.Optional;

public interface RetrieveTaskUseCase {

    Optional<Task> getTask(Long id);

    List<Task> getAllTask();
}
