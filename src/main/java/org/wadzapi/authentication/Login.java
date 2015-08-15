package org.wadzapi.authentication;

import org.wadzapi.qualifiers.LoggedIn;
import org.wadzapi.qualifiers.UserDatabase;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

@SessionScoped
@Named

/**
 * {@see http://docs.jboss.org/weld/reference/latest-2.2/en-US/html/example.html}
 */
public class Login implements Serializable {

    @Inject Credentials credentials;

    @Inject
    @UserDatabase
    EntityManager userDatabase;


    private User user;


    public void login() {

        List<User> results = userDatabase.createQuery(
                "select u from User u where u.login = :login and u.password = :password")
                .setParameter("login", credentials.getLogin())
                .setParameter("password", credentials.getPassword())
                .getResultList();
        if (!results.isEmpty()) {
            user = results.get(0);
        }
        else {
            // perhaps add code here to report a failed login
        }
    }


    public void logout() {
        user = null;
    }


    public boolean isLoggedIn() {
        return user != null;
    }


    @Produces
    @LoggedIn
    User getCurrentUser() {
        return user;
    }

}
