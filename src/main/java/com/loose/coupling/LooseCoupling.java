package com.loose.coupling;

public class LooseCoupling {
    public static void main(String[] args) {
        IUserDatabase userDatabase = new UserDatabase();
        UserManager userManager = new UserManager(userDatabase);
        System.out.println(userManager.getUserInfo());

        IUserDatabase webService = new WebService();
        UserManager webServiceManager = new UserManager(webService);
        System.out.println(webServiceManager.getUserInfo());
    }
}
