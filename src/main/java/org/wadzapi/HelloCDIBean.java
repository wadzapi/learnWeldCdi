package org.wadzapi;


import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class HelloCDIBean {

    public String getHello() {
        return "CDI say hello from Weld!";
    }

}