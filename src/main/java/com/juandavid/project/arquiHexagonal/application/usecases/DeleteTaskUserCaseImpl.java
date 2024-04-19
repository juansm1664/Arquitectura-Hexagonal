package com.juandavid.project.arquiHexagonal.application.usecases;

import com.juandavid.project.arquiHexagonal.domain.ports.in.DeleteTaskUseCase;
import com.juandavid.project.arquiHexagonal.domain.ports.out.TaskResponsitoryPort;

public class DeleteTaskUserCaseImpl implements DeleteTaskUseCase {

    private final TaskResponsitoryPort taskResponsitoryPort;

    public DeleteTaskUserCaseImpl(TaskResponsitoryPort taskResponsitoryPort) {
        this.taskResponsitoryPort = taskResponsitoryPort;
    }


    @Override
    public boolean deleteTask(Long id) {
        return taskResponsitoryPort.deleteById(id);
    }
}
