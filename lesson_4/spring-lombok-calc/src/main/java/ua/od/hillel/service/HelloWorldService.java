package ua.od.hillel.service;

import org.springframework.stereotype.Service;
import ua.od.hillel.controller.dto.GreetingDto;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by ruslangramatic on 5/5/18.
 */
@Service
public class HelloWorldService {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    public GreetingDto sayHello(String name) {
        return new GreetingDto(counter.incrementAndGet(), String.format(template, name));
    }
}
