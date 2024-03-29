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
public class Spupdateaddress extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -229934871;

    /**
     * The parameter <code>users.spUpdateAddress.p_user_id</code>.
     */
    public static final Parameter<Integer> P_USER_ID = Internal.createParameter("p_user_id", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>users.spUpdateAddress.p_address_line1</code>.
     */
    public static final Parameter<String> P_ADDRESS_LINE1 = Internal.createParameter("p_address_line1", org.jooq.impl.SQLDataType.VARCHAR(255), false, false);

    /**
     * The parameter <code>users.spUpdateAddress.p_address_line2</code>.
     */
    public static final Parameter<String> P_ADDRESS_LINE2 = Internal.createParameter("p_address_line2", org.jooq.impl.SQLDataType.VARCHAR(255), false, false);

    /**
     * The parameter <code>users.spUpdateAddress.p_province</code>.
     */
    public static final Parameter<String> P_PROVINCE = Internal.createParameter("p_province", org.jooq.impl.SQLDataType.VARCHAR(255), false, false);

    /**
     * The parameter <code>users.spUpdateAddress.p_canton</code>.
     */
    public static final Parameter<String> P_CANTON = Internal.createParameter("p_canton", org.jooq.impl.SQLDataType.VARCHAR(255), false, false);

    /**
     * The parameter <code>users.spUpdateAddress.p_postal_code</code>.
     */
    public static final Parameter<String> P_POSTAL_CODE = Internal.createParameter("p_postal_code", org.jooq.impl.SQLDataType.VARCHAR(10), false, false);

    /**
     * Create a new routine call instance
     */
    public Spupdateaddress() {
        super("spUpdateAddress", Users.USERS);

        addInParameter(P_USER_ID);
        addInParameter(P_ADDRESS_LINE1);
        addInParameter(P_ADDRESS_LINE2);
        addInParameter(P_PROVINCE);
        addInParameter(P_CANTON);
        addInParameter(P_POSTAL_CODE);
    }

    /**
     * Set the <code>p_user_id</code> parameter IN value to the routine
     */
    public void setPUserId(Integer value) {
        setValue(P_USER_ID, value);
    }

    /**
     * Set the <code>p_address_line1</code> parameter IN value to the routine
     */
    public void setPAddressLine1(String value) {
        setValue(P_ADDRESS_LINE1, value);
    }

    /**
     * Set the <code>p_address_line2</code> parameter IN value to the routine
     */
    public void setPAddressLine2(String value) {
        setValue(P_ADDRESS_LINE2, value);
    }

    /**
     * Set the <code>p_province</code> parameter IN value to the routine
     */
    public void setPProvince(String value) {
        setValue(P_PROVINCE, value);
    }

    /**
     * Set the <code>p_canton</code> parameter IN value to the routine
     */
    public void setPCanton(String value) {
        setValue(P_CANTON, value);
    }

    /**
     * Set the <code>p_postal_code</code> parameter IN value to the routine
     */
    public void setPPostalCode(String value) {
        setValue(P_POSTAL_CODE, value);
    }
}
