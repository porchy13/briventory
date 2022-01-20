/*
 * This file is generated by jOOQ.
 */
package jooq.tables.records;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotNull;

import java.beans.ConstructorProperties;

import javax.annotation.Nonnull;
import javax.annotation.processing.Generated;

import jooq.tables.ContainerComposition;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
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
    name = "container_composition",
    schema = "public",
    uniqueConstraints = {
        @UniqueConstraint(name = "unique_container_composition_on_locker", columnNames = { "id_locker" })
    }
)
public class ContainerCompositionRecord extends UpdatableRecordImpl<ContainerCompositionRecord> implements Record3<Long, Long, Short> {

    private static final long serialVersionUID = 501973825;

    /**
     * Setter for <code>public.container_composition.id_container</code>.
     */
    public ContainerCompositionRecord setIdContainer(@Nonnull Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.container_composition.id_container</code>.
     */
    @Column(name = "id_container", nullable = false, precision = 64)
    @NotNull
    @Nonnull
    public Long getIdContainer() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.container_composition.id_locker</code>.
     */
    public ContainerCompositionRecord setIdLocker(@Nonnull Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.container_composition.id_locker</code>.
     */
    @Column(name = "id_locker", nullable = false, precision = 64)
    @NotNull
    @Nonnull
    public Long getIdLocker() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.container_composition.position</code>.
     */
    public ContainerCompositionRecord setPosition(@Nonnull Short value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.container_composition.position</code>.
     */
    @Column(name = "position", nullable = false, precision = 16)
    @Nonnull
    public Short getPosition() {
        return (Short) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    @Nonnull
    public Record2<Long, Long> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    @Nonnull
    public Row3<Long, Long, Short> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    @Nonnull
    public Row3<Long, Long, Short> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    @Nonnull
    public Field<Long> field1() {
        return ContainerComposition.CONTAINER_COMPOSITION.ID_CONTAINER;
    }

    @Override
    @Nonnull
    public Field<Long> field2() {
        return ContainerComposition.CONTAINER_COMPOSITION.ID_LOCKER;
    }

    @Override
    @Nonnull
    public Field<Short> field3() {
        return ContainerComposition.CONTAINER_COMPOSITION.POSITION;
    }

    @Override
    @Nonnull
    public Long component1() {
        return getIdContainer();
    }

    @Override
    @Nonnull
    public Long component2() {
        return getIdLocker();
    }

    @Override
    @Nonnull
    public Short component3() {
        return getPosition();
    }

    @Override
    @Nonnull
    public Long value1() {
        return getIdContainer();
    }

    @Override
    @Nonnull
    public Long value2() {
        return getIdLocker();
    }

    @Override
    @Nonnull
    public Short value3() {
        return getPosition();
    }

    @Override
    @Nonnull
    public ContainerCompositionRecord value1(@Nonnull Long value) {
        setIdContainer(value);
        return this;
    }

    @Override
    @Nonnull
    public ContainerCompositionRecord value2(@Nonnull Long value) {
        setIdLocker(value);
        return this;
    }

    @Override
    @Nonnull
    public ContainerCompositionRecord value3(@Nonnull Short value) {
        setPosition(value);
        return this;
    }

    @Override
    @Nonnull
    public ContainerCompositionRecord values(@Nonnull Long value1, @Nonnull Long value2, @Nonnull Short value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ContainerCompositionRecord
     */
    public ContainerCompositionRecord() {
        super(ContainerComposition.CONTAINER_COMPOSITION);
    }

    /**
     * Create a detached, initialised ContainerCompositionRecord
     */
    @ConstructorProperties({ "idContainer", "idLocker", "position" })
    public ContainerCompositionRecord(@Nonnull Long idContainer, @Nonnull Long idLocker, @Nonnull Short position) {
        super(ContainerComposition.CONTAINER_COMPOSITION);

        setIdContainer(idContainer);
        setIdLocker(idLocker);
        setPosition(position);
    }
}
