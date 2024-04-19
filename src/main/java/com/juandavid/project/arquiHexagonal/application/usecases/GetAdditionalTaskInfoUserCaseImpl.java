package com.juandavid.project.arquiHexagonal.application.usecases;

import com.juandavid.project.arquiHexagonal.domain.models.AdditionalTaskInfo;
import com.juandavid.project.arquiHexagonal.domain.ports.in.GetAdditionalTaskInfoUseCase;
import com.juandavid.project.arquiHexagonal.domain.ports.out.ExternalServicePort;

public class GetAdditionalTaskInfoUserCaseImpl implements GetAdditionalTaskInfoUseCase {

    private final ExternalServicePort externalServicePort;

    public GetAdditionalTaskInfoUserCaseImpl(ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long id) {
        return externalServicePort.getAdditionalTaskInfo(id);
    }
}
