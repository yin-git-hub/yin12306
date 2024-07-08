package org.yin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 */
@SpringBootApplication
public class YinMamber12306
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext run = SpringApplication.run(YinMamber12306.class, args);
        String property = run.getEnvironment().getProperty("server.port");
        String path = run.getEnvironment().getProperty("server.servlet.context-path");
        System.out.println("http://localhost:"+property +path+"/test/test1");
    }
}
