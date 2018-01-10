package com.antonromanov.springHWbyMaven;

// This Project created by Anton Romanov (www.antonromanov.com) 10.01.2018 at 17:50
// Source URL - http://www.mkyong.com/spring/quick-start-maven-spring-example/
// Git Hub repo - https://github.com/SPRINGlessons/OLD-XML-SPRING-IDEA-with-MAVEN/blob/master/README.md



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "Spring-Module.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        obj.printHello();
    }


}
