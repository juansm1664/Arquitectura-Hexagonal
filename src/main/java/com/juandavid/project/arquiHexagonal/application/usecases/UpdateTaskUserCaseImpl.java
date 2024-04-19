package com.juandavid.project.arquiHexagonal.application.usecases;

import com.juandavid.project.arquiHexagonal.domain.models.Task;
import com.juandavid.project.arquiHexagonal.domain.ports.in.UpdateTaskUseCase;
import com.juandavid.project.arquiHexagonal.domain.ports.out.TaskResponsitoryPort;

import java.util.Optional;

public class UpdateTaskUserCaseImpl implements UpdateTaskUseCase {

    private final TaskResponsitoryPort taskResponsitoryPort;

    public UpdateTaskUserCaseImpl(TaskResponsitoryPort taskResponsitoryPort) {
        this.taskResponsitoryPort = taskResponsitoryPort;
    }


    @Override
    public Optional<Task> updateTask(Long id, Task updatedTask) {
        return taskResponsitoryPort.update(updatedTask);
    }

}
