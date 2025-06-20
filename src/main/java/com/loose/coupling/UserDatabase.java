package com.loose.coupling;

public class UserDatabase implements IUserDatabase {
    @Override
    public String getUserDetails() {
        return "User Details From Database";
    }
}
