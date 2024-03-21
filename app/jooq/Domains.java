/*
 * This file is generated by jOOQ.
 */
package jooq;


import org.jooq.Domain;
import org.jooq.Schema;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.LazySchema;
import org.jooq.impl.SQLDataType;

import javax.annotation.processing.Generated;


/**
 * Convenience access to all Domains in public.
 */
@Generated(
    value = {
        "https://www.jooq.org"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Domains {

    /**
     * The domain <code>public.domain_alpha_component</code>.
     */
    public static final Domain<Float> DOMAIN_ALPHA_COMPONENT = Internal.createDomain(
          schema()
        , DSL.name("domain_alpha_component")
        , SQLDataType.REAL
        , Internal.createCheck(null, null, "CHECK (((VALUE >= (0)::double precision) AND (VALUE <= (1)::double precision)))")
    );

    /**
     * The domain <code>public.domain_color_component</code>.
     */
    public static final Domain<Short> DOMAIN_COLOR_COMPONENT = Internal.createDomain(
          schema()
        , DSL.name("domain_color_component")
        , SQLDataType.SMALLINT
        , Internal.createCheck(null, null, "CHECK (((VALUE >= 0) AND (VALUE <= 255)))")
    );

    /**
     * The domain <code>public.domain_dimension</code>.
     */
    public static final Domain<Double> DOMAIN_DIMENSION = Internal.createDomain(
          schema()
        , DSL.name("domain_dimension")
        , SQLDataType.FLOAT
    );

    /**
     * The domain <code>public.domain_email</code>.
     */
    public static final Domain<String> DOMAIN_EMAIL = Internal.createDomain(
          schema()
        , DSL.name("domain_email")
        , SQLDataType.VARCHAR(1024)
    );

    /**
     * The domain <code>public.domain_format_string</code>.
     */
    public static final Domain<String> DOMAIN_FORMAT_STRING = Internal.createDomain(
          schema()
        , DSL.name("domain_format_string")
        , SQLDataType.VARCHAR(256)
    );

    /**
     * The domain <code>public.domain_name</code>.
     */
    public static final Domain<String> DOMAIN_NAME = Internal.createDomain(
          schema()
        , DSL.name("domain_name")
        , SQLDataType.VARCHAR(1024)
    );

    /**
     * The domain <code>public.domain_password</code>.
     */
    public static final Domain<String> DOMAIN_PASSWORD = Internal.createDomain(
          schema()
        , DSL.name("domain_password")
        , SQLDataType.VARCHAR(1024)
    );

    /**
     * The domain <code>public.domain_revision</code>.
     */
    public static final Domain<String> DOMAIN_REVISION = Internal.createDomain(
          schema()
        , DSL.name("domain_revision")
        , SQLDataType.VARCHAR(16)
    );

    /**
     * The domain <code>public.domain_token</code>.
     */
    public static final Domain<String> DOMAIN_TOKEN = Internal.createDomain(
          schema()
        , DSL.name("domain_token")
        , SQLDataType.VARCHAR(64)
    );

    /**
     * The domain <code>public.domain_url</code>.
     */
    public static final Domain<String> DOMAIN_URL = Internal.createDomain(
          schema()
        , DSL.name("domain_url")
        , SQLDataType.VARCHAR(4096)
    );

    /**
     * The domain <code>public.domain_username</code>.
     */
    public static final Domain<String> DOMAIN_USERNAME = Internal.createDomain(
          schema()
        , DSL.name("domain_username")
        , SQLDataType.VARCHAR(1024)
    );

    private static final Schema schema() {
        return new LazySchema(DSL.name("public"), DSL.comment(""), () -> Public.PUBLIC);
    }
}
