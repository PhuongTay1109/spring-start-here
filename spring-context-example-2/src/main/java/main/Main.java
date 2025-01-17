package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(
                        ProjectConfig.class);

        Parrot x = new Parrot();
        x.setName("Kiki");

        Supplier<Parrot> parrotSupplier = () -> x;


        // <T> void registerBean(
        //  String beanName,
        //  Class<T> beanClass,
        //  Supplier<T> supplier,
        //  BeanDefinitionCustomizer... customizers);

        context.registerBean("parrot1",
                Parrot.class, parrotSupplier);

        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());
    }
}
