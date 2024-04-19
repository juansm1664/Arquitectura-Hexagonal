package com.juandavid.project.arquiHexagonal.domain.ports.out;

import com.juandavid.project.arquiHexagonal.domain.models.Task;

import java.util.List;
import java.util.Optional;

public interface TaskResponsitoryPort {
    Task save(Task task);
    Optional<Task> findById(Long id);
    List<Task> findAll();
    Optional<Task> update(Task task);
    boolean deleteById(Long id);
}
