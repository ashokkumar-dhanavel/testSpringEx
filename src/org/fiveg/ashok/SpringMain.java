package org.fiveg.ashok;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by linuxuser on 20/1/16.
 */
public class SpringMain {
    public static void main(String args[]){

        AbstractApplicationContext context = new FileSystemXmlApplicationContext("src/org/fiveg/ashok/Beans.xml");

        SpringTest test = (SpringTest) context.getBean("SpringTest");
        test.setMessage("Hello ashok");
        System.out.println(test.getMessage());

        context.registerShutdownHook();
    }
}
