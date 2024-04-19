package com.juandavid.project.arquiHexagonal.application.usecases;

import com.juandavid.project.arquiHexagonal.domain.models.Task;
import com.juandavid.project.arquiHexagonal.domain.ports.in.RetrieveTaskUseCase;
import com.juandavid.project.arquiHexagonal.domain.ports.out.ExternalServicePort;
import com.juandavid.project.arquiHexagonal.domain.ports.out.TaskResponsitoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveTaskUserCaseImpl implements RetrieveTaskUseCase {

    private final TaskResponsitoryPort taskResponsitoryPort;

    public RetrieveTaskUserCaseImpl(TaskResponsitoryPort taskResponsitoryPort) {
        this.taskResponsitoryPort = taskResponsitoryPort;
    }


    @Override
    public Optional<Task> getTask(Long id) {
        return taskResponsitoryPort.findById(id);
    }

    @Override
    public List<Task> getAllTask() {
        return taskResponsitoryPort.findAll();
    }
}
