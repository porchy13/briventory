/*
 * This file is generated by jOOQ.
 */
package jooq.tables.records;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.beans.ConstructorProperties;
import java.time.LocalDate;

import javax.annotation.Nonnull;
import javax.annotation.processing.Generated;

import jooq.tables.BricksetTokens;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.16.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(
    name = "brickset_tokens",
    schema = "public"
)
public class BricksetTokensRecord extends UpdatableRecordImpl<BricksetTokensRecord> implements Record5<Long, String, String, String, LocalDate> {

    private static final long serialVersionUID = -2027172227;

    /**
     * Setter for <code>public.brickset_tokens.id_account</code>.
     */
    public BricksetTokensRecord setIdAccount(@Nonnull Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.brickset_tokens.id_account</code>.
     */
    @Id
    @Column(name = "id_account", nullable = false, precision = 64)
    @NotNull
    @Nonnull
    public Long getIdAccount() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.brickset_tokens.api_key</code>.
     */
    public BricksetTokensRecord setApiKey(@Nonnull String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.brickset_tokens.api_key</code>.
     */
    @Column(name = "api_key", nullable = false, length = 64)
    @NotNull
    @Size(max = 64)
    @Nonnull
    public String getApiKey() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.brickset_tokens.username</code>.
     */
    public BricksetTokensRecord setUsername(@Nonnull String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.brickset_tokens.username</code>.
     */
    @Column(name = "username", nullable = false, length = 1024)
    @NotNull
    @Size(max = 1024)
    @Nonnull
    public String getUsername() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.brickset_tokens.password</code>.
     */
    public BricksetTokensRecord setPassword(@Nonnull String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.brickset_tokens.password</code>.
     */
    @Column(name = "password", nullable = false, length = 1024)
    @NotNull
    @Size(max = 1024)
    @Nonnull
    public String getPassword() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.brickset_tokens.valid_until</code>.
     */
    public BricksetTokensRecord setValidUntil(@Nonnull LocalDate value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.brickset_tokens.valid_until</code>.
     */
    @Column(name = "valid_until", nullable = false)
    @Nonnull
    public LocalDate getValidUntil() {
        return (LocalDate) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    @Nonnull
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    @Nonnull
    public Row5<Long, String, String, String, LocalDate> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    @Nonnull
    public Row5<Long, String, String, String, LocalDate> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    @Nonnull
    public Field<Long> field1() {
        return BricksetTokens.BRICKSET_TOKENS.ID_ACCOUNT;
    }

    @Override
    @Nonnull
    public Field<String> field2() {
        return BricksetTokens.BRICKSET_TOKENS.API_KEY;
    }

    @Override
    @Nonnull
    public Field<String> field3() {
        return BricksetTokens.BRICKSET_TOKENS.USERNAME;
    }

    @Override
    @Nonnull
    public Field<String> field4() {
        return BricksetTokens.BRICKSET_TOKENS.PASSWORD;
    }

    @Override
    @Nonnull
    public Field<LocalDate> field5() {
        return BricksetTokens.BRICKSET_TOKENS.VALID_UNTIL;
    }

    @Override
    @Nonnull
    public Long component1() {
        return getIdAccount();
    }

    @Override
    @Nonnull
    public String component2() {
        return getApiKey();
    }

    @Override
    @Nonnull
    public String component3() {
        return getUsername();
    }

    @Override
    @Nonnull
    public String component4() {
        return getPassword();
    }

    @Override
    @Nonnull
    public LocalDate component5() {
        return getValidUntil();
    }

    @Override
    @Nonnull
    public Long value1() {
        return getIdAccount();
    }

    @Override
    @Nonnull
    public String value2() {
        return getApiKey();
    }

    @Override
    @Nonnull
    public String value3() {
        return getUsername();
    }

    @Override
    @Nonnull
    public String value4() {
        return getPassword();
    }

    @Override
    @Nonnull
    public LocalDate value5() {
        return getValidUntil();
    }

    @Override
    @Nonnull
    public BricksetTokensRecord value1(@Nonnull Long value) {
        setIdAccount(value);
        return this;
    }

    @Override
    @Nonnull
    public BricksetTokensRecord value2(@Nonnull String value) {
        setApiKey(value);
        return this;
    }

    @Override
    @Nonnull
    public BricksetTokensRecord value3(@Nonnull String value) {
        setUsername(value);
        return this;
    }

    @Override
    @Nonnull
    public BricksetTokensRecord value4(@Nonnull String value) {
        setPassword(value);
        return this;
    }

    @Override
    @Nonnull
    public BricksetTokensRecord value5(@Nonnull LocalDate value) {
        setValidUntil(value);
        return this;
    }

    @Override
    @Nonnull
    public BricksetTokensRecord values(@Nonnull Long value1, @Nonnull String value2, @Nonnull String value3, @Nonnull String value4, @Nonnull LocalDate value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BricksetTokensRecord
     */
    public BricksetTokensRecord() {
        super(BricksetTokens.BRICKSET_TOKENS);
    }

    /**
     * Create a detached, initialised BricksetTokensRecord
     */
    @ConstructorProperties({ "idAccount", "apiKey", "username", "password", "validUntil" })
    public BricksetTokensRecord(@Nonnull Long idAccount, @Nonnull String apiKey, @Nonnull String username, @Nonnull String password, @Nonnull LocalDate validUntil) {
        super(BricksetTokens.BRICKSET_TOKENS);

        setIdAccount(idAccount);
        setApiKey(apiKey);
        setUsername(username);
        setPassword(password);
        setValidUntil(validUntil);
    }
}