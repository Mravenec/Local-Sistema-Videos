/*
 * This file is generated by jOOQ.
 */
package com.tuprimernegocio.library.database.jooq.email_config;


import com.tuprimernegocio.library.database.jooq.email_config.tables.EmailConfig;
import com.tuprimernegocio.library.database.jooq.email_config.tables.records.EmailConfigRecord;

import javax.annotation.processing.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>email_config</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<EmailConfigRecord, Integer> IDENTITY_EMAIL_CONFIG_ = Identities0.IDENTITY_EMAIL_CONFIG_;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<EmailConfigRecord> KEY_EMAIL_CONFIG_PRIMARY = UniqueKeys0.KEY_EMAIL_CONFIG_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<EmailConfigRecord, Integer> IDENTITY_EMAIL_CONFIG_ = Internal.createIdentity(EmailConfig.EMAIL_CONFIG_, EmailConfig.EMAIL_CONFIG_.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<EmailConfigRecord> KEY_EMAIL_CONFIG_PRIMARY = Internal.createUniqueKey(EmailConfig.EMAIL_CONFIG_, "KEY_email_config_PRIMARY", EmailConfig.EMAIL_CONFIG_.ID);
    }
}