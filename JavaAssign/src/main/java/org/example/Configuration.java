package org.example;

import org.example.objects.MyProduct1;
import org.example.objects.MyProduct2;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public SenderReceiver emailServiceBean() {
        return new SenderReceiver();
    }

    @Bean
    public MyProduct1 objectA(MyProduct2 myProduct2) {
        return new MyProduct1(myProduct2);
    }

    @Bean
    public MyProduct2 objectB() {
        return new MyProduct2();
    }
}
