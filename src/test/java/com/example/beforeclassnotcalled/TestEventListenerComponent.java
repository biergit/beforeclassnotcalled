package com.example.beforeclassnotcalled;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.test.context.event.BeforeTestClassEvent;
import org.springframework.test.context.event.BeforeTestMethodEvent;

@Component
public class TestEventListenerComponent {
    @EventListener
    public void beforeEach(BeforeTestMethodEvent event) {
        System.out.println("I work");
    }
    @EventListener
    public void beforeAll(BeforeTestClassEvent event) {
        System.out.println("Why don't I?");
    }
}
