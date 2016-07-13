package com.zmannotes.spring.worker;

import org.springframework.stereotype.Component;

@Component    //Component注解标明该类可以被自动发现
public class Worker {

    public void start() throws InterruptedException {
        while (true) {
            System.out.println("I'm working...");
            // 暂时1s
            Thread.sleep(1000);
        }
    }
}
