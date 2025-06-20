package com.loose.coupling;

public class UserManager {
    private IUserDatabase userDatabase;

    public UserManager(IUserDatabase userDatabase) {
        this.userDatabase = userDatabase;
    }

    public String getUserInfo() {
        return userDatabase.getUserDetails();
    }
}
