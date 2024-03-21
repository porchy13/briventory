/*
 * This file is generated by jOOQ.
 */
package jooq.tables.records;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jooq.tables.ColorSource;
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
    name = "color_source",
    schema = "public"
)
public class ColorSourceRecord extends UpdatableRecordImpl<ColorSourceRecord> {

    private static final long serialVersionUID = 583086400;

    /**
     * Setter for <code>public.color_source.id</code>.
     */
    public ColorSourceRecord setId(@Nullable Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.color_source.id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Nullable
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.color_source.name</code>.
     */
    public ColorSourceRecord setName(@Nonnull String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.color_source.name</code>.
     */
    @Column(name = "name", nullable = false, length = 1024)
    @NotNull
    @Size(max = 1024)
    @Nonnull
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.color_source.url</code>.
     */
    public ColorSourceRecord setUrl(@Nonnull String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.color_source.url</code>.
     */
    @Column(name = "url", nullable = false, length = 4096)
    @NotNull
    @Size(max = 4096)
    @Nonnull
    public String getUrl() {
        return (String) get(2);
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
     * Create a detached ColorSourceRecord
     */
    public ColorSourceRecord() {
        super(ColorSource.COLOR_SOURCE);
    }

    /**
     * Create a detached, initialised ColorSourceRecord
     */
    @ConstructorProperties({ "id", "name", "url" })
    public ColorSourceRecord(@Nullable Long id, @Nonnull String name, @Nonnull String url) {
        super(ColorSource.COLOR_SOURCE);

        setId(id);
        setName(name);
        setUrl(url);
        resetChangedOnNotNull();
    }
}
