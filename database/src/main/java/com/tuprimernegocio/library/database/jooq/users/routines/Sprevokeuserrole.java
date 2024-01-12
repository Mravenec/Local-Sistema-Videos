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
public class Sprevokeuserrole extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1034687496;

    /**
     * The parameter <code>users.spRevokeUserRole.p_user_id</code>.
     */
    public static final Parameter<Integer> P_USER_ID = Internal.createParameter("p_user_id", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public Sprevokeuserrole() {
        super("spRevokeUserRole", Users.USERS);

        addInParameter(P_USER_ID);
    }

    /**
     * Set the <code>p_user_id</code> parameter IN value to the routine
     */
    public void setPUserId(Integer value) {
        setValue(P_USER_ID, value);
    }
}
