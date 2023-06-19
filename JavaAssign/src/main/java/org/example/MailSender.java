package org.example;

import org.example.controller.Controller;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MailSender {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MailSender.class, args);
        Controller controller = context.getBean(Controller.class);
        System.out.println(controller.getObjects());
    }
}
