package org.processor;

import org.springframework.stereotype.Component;

@Component
public class TestBean {

    public void dependencyTest() {
        System.out.println("common-module-test");
    }
}
