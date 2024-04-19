package com.juandavid.project.arquiHexagonal.domain.ports.in;

import com.juandavid.project.arquiHexagonal.domain.models.Task;

public interface CreateTaskUserCase {

    Task createTask(Task task);
}
