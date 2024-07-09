package org.yin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("org.yin.**.mapper")
//@MapperScan
public class Yin12306Application
{
    @Value("${mybatis-plus.mapperPackage}")
    public String a ;
    public static void main( String[] args )
    {

        ConfigurableApplicationContext run = SpringApplication.run(Yin12306Application.class, args);
        String property = run.getEnvironment().getProperty("server.port");
        String path = run.getEnvironment().getProperty("server.servlet.context-path");
        System.out.println("http://localhost:"+property +path+"/doc.html");
    }
}
