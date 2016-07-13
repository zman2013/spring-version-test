package com.zmannotes.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zmannotes.spring.worker.Worker;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App implements CommandLineRunner {

    @Autowired
    private Worker worker;

    /** main函数 */
    public static void main( String[] args )
    {
        SpringApplication.run(App.class);
    }

    /** 程序入口 */
    public void run(String... args) throws Exception {
        worker.start();
    }

}
