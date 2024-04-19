package com.juandavid.project.arquiHexagonal.infrastructure.config;

import com.juandavid.project.arquiHexagonal.application.services.TaskService;
import com.juandavid.project.arquiHexagonal.application.usecases.*;
import com.juandavid.project.arquiHexagonal.domain.ports.out.ExternalServicePort;
import com.juandavid.project.arquiHexagonal.domain.ports.out.TaskResponsitoryPort;
import com.juandavid.project.arquiHexagonal.infrastructure.adapters.ExternalServiceAdapter;
import com.juandavid.project.arquiHexagonal.infrastructure.repositories.JpaTaskRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ApplicationConfig {

    @Bean
    public TaskService taskService(TaskResponsitoryPort taskResponsitoryPort, GetAdditionalTaskInfoUserCaseImpl getAdditionalTaskInfoUserCase) {

        return new TaskService(
                        new CreateTaskUserCaseImpl(taskResponsitoryPort),
                        new RetrieveTaskUserCaseImpl(taskResponsitoryPort),
                        new UpdateTaskUserCaseImpl(taskResponsitoryPort),
                getAdditionalTaskInfoUserCase,
                new DeleteTaskUserCaseImpl(taskResponsitoryPort)
                );
    }

    @Bean
    public TaskResponsitoryPort taskResponsitoryPort(JpaTaskRepositoryAdapter jpaTaskRepositoryAdapter) {
        return jpaTaskRepositoryAdapter;
    }
    @Bean
    public GetAdditionalTaskInfoUserCaseImpl getAdditionalTaskInfoUserCaseImpl(ExternalServicePort externalServicePort){
        return new GetAdditionalTaskInfoUserCaseImpl(externalServicePort);
    }

    @Bean
    public ExternalServicePort externalServicePort() {
        return new ExternalServiceAdapter();
    }

}
