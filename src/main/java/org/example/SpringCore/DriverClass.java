package org.example.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {

    public static void main(String[] args) {

//        Samsung olds7 = new Samsung();
//        olds7.config();

        /**
         * We don't want to go for tis way
         * because we want to achieve dependency injection through spring.
         */

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Samsung s7 = context.getBean(Samsung.class);
        s7.config();

    }
}
