package com.juandavid.project.arquiHexagonal.infrastructure.repositories;

import com.juandavid.project.arquiHexagonal.infrastructure.entites.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTaskRepository extends JpaRepository<TaskEntity, Long> {

}
