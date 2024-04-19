package com.juandavid.project.arquiHexagonal.domain.models;

public class AdditionalTaskInfo {

    private final Long userId;
    private final String userName;
    private final String UserEmail;

    public AdditionalTaskInfo(Long userId, String userName, String userEmail) {
        this.userId = userId;
        this.userName = userName;
        UserEmail = userEmail;
    }

    public Long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return UserEmail;
    }
}
