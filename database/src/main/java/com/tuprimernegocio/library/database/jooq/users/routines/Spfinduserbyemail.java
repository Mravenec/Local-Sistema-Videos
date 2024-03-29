/*
 * This file is generated by jOOQ.
 */
package com.tuprimernegocio.library.database.jooq.users.routines;


import com.tuprimernegocio.library.database.jooq.users.Users;

import javax.annotation.processing.Generated;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Spfinduserbyemail extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 686669388;

    /**
     * The parameter <code>users.spFindUserByEmail.p_email</code>.
     */
    public static final Parameter<String> P_EMAIL = Internal.createParameter("p_email", org.jooq.impl.SQLDataType.VARCHAR(255), false, false);

    /**
     * Create a new routine call instance
     */
    public Spfinduserbyemail() {
        super("spFindUserByEmail", Users.USERS);

        addInParameter(P_EMAIL);
    }

    /**
     * Set the <code>p_email</code> parameter IN value to the routine
     */
    public void setPEmail(String value) {
        setValue(P_EMAIL, value);
    }
}
