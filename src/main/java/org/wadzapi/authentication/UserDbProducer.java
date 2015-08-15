package org.wadzapi.authentication;

import org.wadzapi.qualifiers.UserDatabase;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

class UserDbProducer {

    @Produces
    @UserDatabase
    @PersistenceContext
    static EntityManager userDatabase;

}