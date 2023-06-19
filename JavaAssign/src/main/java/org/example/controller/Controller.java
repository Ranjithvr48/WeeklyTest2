package org.example.controller;

import org.example.SenderReceiver;
import org.example.objects.MyProduct1;
import org.example.objects.MyProduct2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    private final MyProduct1 myProduct1;
    private final SenderReceiver senderReceiver;

    @Autowired
    public Controller(MyProduct1 myProduct1, SenderReceiver senderReceiver) {
        this.myProduct1 = myProduct1;
        this.senderReceiver = senderReceiver;
    }

    @GetMapping("/objects")
    public String getObjects() {
        MyProduct2 myProduct2 = myProduct1.getObjectB();

        if (myProduct2 != null) {
            String subject = "My Result through mail integration";
            String message = "My Favorite vehicle 1 :" + myProduct1 + "\nMy Favorite vehicle 2 :" + myProduct2;
            senderReceiver.sendEmail(subject, message);
            return myProduct1.toString() + "\n" + myProduct2.toString();
        } else {
            return "My Favorite vehicle 1 :" + myProduct1 + "\nMy Favorite vehicle 2 : " + myProduct2;
        }
    }
}
