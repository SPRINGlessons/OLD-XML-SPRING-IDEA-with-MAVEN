// This Project created by Anton Romanov (www.antonromanov.com) 10.01.2018 at 17:47
// Source URL - http://www.mkyong.com/spring/quick-start-maven-spring-example/
// Git Hub repo - https://github.com/SPRINGlessons/OLD-XML-SPRING-IDEA-with-MAVEN/blob/master/README.md

/**
 * Spring bean
 *
 */


package com.antonromanov.springHWbyMaven;

public class HelloWorld {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Hello ! " + name);
    }


}
