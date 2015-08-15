package org.wadzapi.authentication;

import org.hibernate.validator.constraints.Length;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

/**
 * CDI webapp tutorial
 * {@see http://docs.jboss.org/weld/reference/latest-2.2/en-US/html/example.html}
 */
@Named @RequestScoped
public class Credentials {

    //TODO Разобраться с аннотаниями нужны на get только? или на set тоже?
    private String login;

    private String password;

    @NotNull @Length(min=3, max=20)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @NotNull @Length(min=6, max=20)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
