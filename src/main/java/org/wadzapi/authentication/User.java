package org.wadzapi.authentication;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * {@see http://docs.jboss.org/weld/reference/latest-2.2/en-US/html/example.html}
 */
@Entity
public class User {

    private @NotNull @Length(min=3, max=25) @Id String login;

    private @NotNull @Length(min=6, max=20) String password;


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}