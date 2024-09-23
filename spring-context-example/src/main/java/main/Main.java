package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // When creating the Spring context instance,
        // send the configuration class as a parameter to instruct Spring to use it.
        var context =
                new AnnotationConfigApplicationContext(
                        ProjectConfig.class);

//        Parrot p = context.getBean(Parrot.class);
//
//        System.out.println(p.getName());

        String s = context.getBean(String.class);
        System.out.println(s);

        Integer n = context.getBean(Integer.class);
        System.out.println(n);

        Parrot p2 = context.getBean("parrot2", Parrot.class);
        System.out.println(p2.getName());
    }
}
