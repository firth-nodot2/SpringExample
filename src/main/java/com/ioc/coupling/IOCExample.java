package com.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationIoC.xml");

//        IUserDatabase userDatabase = new UserDatabase();
//        UserManager userManager = new UserManager(userDatabase);
        UserManager userManager = (UserManager) context.getBean("userManagerWithData");
        System.out.println(userManager.getUserInfo());

//        IUserDatabase webService = new WebService();
//        UserManager webServiceManager = new UserManager(webService);
        UserManager webServiceManager = (UserManager) context.getBean("userManagerWithWeb");
        System.out.println(webServiceManager.getUserInfo());
    }
}
