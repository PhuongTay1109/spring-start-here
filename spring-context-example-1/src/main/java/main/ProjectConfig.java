package main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "main") // tell Spring where to look for classes annotated with stereotype annotations.
public class ProjectConfig {

}
