/*
 * This file is generated by jOOQ.
 */
package jooq.tables.records;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jooq.tables.PrivateContainer;
import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.processing.Generated;
import java.beans.ConstructorProperties;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
@Entity
@Table(
    name = "private_container",
    schema = "public"
)
public class PrivateContainerRecord extends UpdatableRecordImpl<PrivateContainerRecord> {

    private static final long serialVersionUID = 1925802779;

    /**
     * Setter for <code>public.private_container.id_container</code>.
     */
    public PrivateContainerRecord setIdContainer(@Nonnull Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.private_container.id_container</code>.
     */
    @Id
    @Column(name = "id_container", nullable = false)
    @NotNull
    @Nonnull
    public Long getIdContainer() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.private_container.id_account</code>.
     */
    public PrivateContainerRecord setIdAccount(@Nullable Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.private_container.id_account</code>.
     */
    @Column(name = "id_account")
    @Nullable
    public Long getIdAccount() {
        return (Long) get(1);
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
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PrivateContainerRecord
     */
    public PrivateContainerRecord() {
        super(PrivateContainer.PRIVATE_CONTAINER);
    }

    /**
     * Create a detached, initialised PrivateContainerRecord
     */
    @ConstructorProperties({ "idContainer", "idAccount" })
    public PrivateContainerRecord(@Nonnull Long idContainer, @Nullable Long idAccount) {
        super(PrivateContainer.PRIVATE_CONTAINER);

        setIdContainer(idContainer);
        setIdAccount(idAccount);
        resetChangedOnNotNull();
    }
}
