package com.juandavid.project.arquiHexagonal.application.services;

import com.juandavid.project.arquiHexagonal.domain.models.AdditionalTaskInfo;
import com.juandavid.project.arquiHexagonal.domain.models.Task;
import com.juandavid.project.arquiHexagonal.domain.ports.in.*;

import java.util.List;
import java.util.Optional;

public class TaskService implements CreateTaskUserCase, DeleteTaskUseCase, RetrieveTaskUseCase, UpdateTaskUseCase, GetAdditionalTaskInfoUseCase {

   private final CreateTaskUserCase createTaskUserCase;
   private final RetrieveTaskUseCase retrieveTaskUseCase;
   private final UpdateTaskUseCase updateTaskUseCase;
   private final GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase;
   private final DeleteTaskUseCase deleteTaskUseCase;


    public TaskService(CreateTaskUserCase createTaskUserCase, RetrieveTaskUseCase retrieveTaskUseCase, UpdateTaskUseCase updateTaskUseCase, GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase, DeleteTaskUseCase deleteTaskUseCase) {
        this.createTaskUserCase = createTaskUserCase;
        this.retrieveTaskUseCase = retrieveTaskUseCase;
        this.updateTaskUseCase = updateTaskUseCase;
        this.getAdditionalTaskInfoUseCase = getAdditionalTaskInfoUseCase;
        this.deleteTaskUseCase = deleteTaskUseCase;
    }

    @Override
    public Task createTask(Task task) {
        return createTaskUserCase.createTask(task);
    }

    @Override
    public boolean deleteTask(Long id) {
        return deleteTaskUseCase.deleteTask(id);
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long id) {
        return getAdditionalTaskInfoUseCase.getAdditionalTaskInfo(id);
    }

    @Override
    public Optional<Task> getTask(Long id) {
        return retrieveTaskUseCase.getTask(id);
    }

    @Override
    public List<Task> getAllTask() {
        return retrieveTaskUseCase.getAllTask();
    }

    @Override
    public Optional<Task> updateTask(Long id, Task updatedTask) {
        return updateTaskUseCase.updateTask(id, updatedTask);
    }
}
