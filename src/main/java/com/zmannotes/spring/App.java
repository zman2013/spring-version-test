package com.zmannotes.spring;

import com.zmannotes.spring.worker.Worker;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        Worker worker = (Worker) context.getBean("worker2");
        System.out.println( worker.getConnectionInitSqls().size() );

    }

}
