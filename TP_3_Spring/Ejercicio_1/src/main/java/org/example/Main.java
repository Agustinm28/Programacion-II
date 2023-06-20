package org.example;
import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        ApplicationContextProvider.setApplicationContext(context);

        Arranque arranque = context.getBean(Arranque.class);
        arranque.iniciar();

        context.close();
    }
}