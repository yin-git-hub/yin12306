package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext run = SpringApplication.run(App.class, args);
        String property = run.getEnvironment().getProperty("server.port");
        System.out.println("http://localhost:"+property);
    }
}
