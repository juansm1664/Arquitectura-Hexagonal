package com.juandavid.project.arquiHexagonal.domain.ports.in;

import com.juandavid.project.arquiHexagonal.domain.models.AdditionalTaskInfo;

public interface GetAdditionalTaskInfoUseCase {
    AdditionalTaskInfo getAdditionalTaskInfo(Long id);
}
