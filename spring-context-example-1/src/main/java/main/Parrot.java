package main;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

// @Component: annotate the class for which you want Spring to add a bean to its context.
@Component
public class Parrot {

    private String name;

    @PostConstruct // execute some instructions right after Spring creates the bean
    public void init() {
        this.name = "Kiki";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}