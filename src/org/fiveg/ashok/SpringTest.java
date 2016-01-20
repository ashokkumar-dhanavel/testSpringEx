package org.fiveg.ashok;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * Created by linuxuser on 20/1/16.
 */
@Component
public class SpringTest implements InitializingBean,DisposableBean {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void init(){
        System.out.println("Bean is in init method");
    }

    @Override
    public void destroy(){
        System.out.println("Bean is in destroy method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("Bean is in init method");

    }
}
