package com.juandavid.project.arquiHexagonal.domain.ports.out;

import com.juandavid.project.arquiHexagonal.domain.models.AdditionalTaskInfo;

public interface ExternalServicePort {
    AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);

}
