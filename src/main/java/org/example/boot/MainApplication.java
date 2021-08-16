package org.example.boot;


import org.example.boot.bean.Pet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 这是一个主程序类   test
 */
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args){
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class,args);
        String[] names = run.getBeanDefinitionNames();
        for(String name:names){
            System.out.println(name);
        }

        Pet tom01 = run.getBean("tom",Pet.class);
        Pet tom02 = run.getBean("tom",Pet.class);

        System.out.println("组件：" + (tom01 == tom02));

    }
}
