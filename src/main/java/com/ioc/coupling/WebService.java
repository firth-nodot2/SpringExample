package com.ioc.coupling;

public class WebService implements IUserDatabase {

    @Override
    public String getUserDetails() {
        return "Fetching Data From Web Service";
    }
}
