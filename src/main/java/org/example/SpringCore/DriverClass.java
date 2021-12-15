package org.example.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {

    public static void main(String[] args) {
        /**
         *
         * We have dependencies on right and left side.
         * To get rid of the dependencies of the left side, we
         * introduce the concept of interfaces.
         */
        Vehicle Tesla = new Car();
        Tesla.drive();

        /**
         * Anytime we use the new keyword,we are hard coding something.
         * We want to get rid of that dependency by using the spring framework.
         * So instead of having some like the following:
         * Vehicle yengyeng = new Bike();
         * yengyeng.drive();
         */
        Vehicle yengyeng = new Bike();
        yengyeng.drive();


        /**
         * https://www.baeldung.com/spring-contextannotation-contextcomponentscan
         * the method get bean comes from two interfaces
         * BeanFactory
         * ApplicationContext
         *
         * ApplicationContext is a superset of beanfactory, so it is best to use ApplicationContect
         *
         * ApplicationContext is an interface so we have tp use classpath... to use it
         */

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Vehicle bikey = (Vehicle) context.getBean("vehicle");
//        bikey.drive();

        /**
         * We can also use annotation based configuration
         * this will be done using tbe motor bike example.
         */
//        Vehicle mBike = (Vehicle)context.getBean("motorbike");
//        mBike.drive();

//        Tyre tyres = (Tyre) context.getBean("tyre");
//        System.out.println(tyres);

        Car hunda = (Car)context.getBean("car");
        hunda.drive();
    }
}
