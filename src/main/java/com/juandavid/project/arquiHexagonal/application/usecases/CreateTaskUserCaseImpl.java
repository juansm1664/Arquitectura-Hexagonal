package com.juandavid.project.arquiHexagonal.application.usecases;

import com.juandavid.project.arquiHexagonal.domain.models.Task;
import com.juandavid.project.arquiHexagonal.domain.ports.in.CreateTaskUserCase;
import com.juandavid.project.arquiHexagonal.domain.ports.out.TaskResponsitoryPort;

public class CreateTaskUserCaseImpl implements CreateTaskUserCase {

    private final TaskResponsitoryPort taskResponsitoryPort;

    public CreateTaskUserCaseImpl(TaskResponsitoryPort taskResponsitoryPort) {
        this.taskResponsitoryPort = taskResponsitoryPort;
    }

    @Override
    public Task createTask(Task task) {
        return taskResponsitoryPort.save(task);
    }
}
