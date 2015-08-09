package org.wadzapi;


import javax.faces.bean.ManagedBean;

@ManagedBean(name = "helloCdi")
public class HelloCDIBean {

    public String getHello() {
        return "CDI say hello from Weld!";
    }

}