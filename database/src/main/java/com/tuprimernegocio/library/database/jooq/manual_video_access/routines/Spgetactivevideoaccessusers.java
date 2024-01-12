/*
 * This file is generated by jOOQ.
 */
package com.tuprimernegocio.library.database.jooq.manual_video_access.routines;


import com.tuprimernegocio.library.database.jooq.manual_video_access.ManualVideoAccess;

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
public class Spgetactivevideoaccessusers extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -655212100;

    /**
     * The parameter <code>manual_video_access.spGetActiveVideoAccessUsers.p_admin_id</code>.
     */
    public static final Parameter<Integer> P_ADMIN_ID = Internal.createParameter("p_admin_id", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public Spgetactivevideoaccessusers() {
        super("spGetActiveVideoAccessUsers", ManualVideoAccess.MANUAL_VIDEO_ACCESS);

        addInParameter(P_ADMIN_ID);
    }

    /**
     * Set the <code>p_admin_id</code> parameter IN value to the routine
     */
    public void setPAdminId(Integer value) {
        setValue(P_ADMIN_ID, value);
    }
}