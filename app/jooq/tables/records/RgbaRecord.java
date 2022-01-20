/*
 * This file is generated by jOOQ.
 */
package jooq.tables.records;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotNull;

import java.beans.ConstructorProperties;

import javax.annotation.Nonnull;
import javax.annotation.processing.Generated;

import jooq.tables.Rgba;

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
    name = "rgba",
    schema = "public",
    uniqueConstraints = {
        @UniqueConstraint(name = "unique_rgba_on_components", columnNames = { "red", "green", "blue", "alpha" })
    }
)
public class RgbaRecord extends UpdatableRecordImpl<RgbaRecord> implements Record5<Long, Short, Short, Short, Float> {

    private static final long serialVersionUID = 1808946319;

    /**
     * Setter for <code>public.rgba.id</code>.
     */
    public RgbaRecord setId(@Nonnull Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.rgba.id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, precision = 64)
    @Nonnull
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.rgba.red</code>.
     */
    public RgbaRecord setRed(@Nonnull Short value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.rgba.red</code>.
     */
    @Column(name = "red", nullable = false, precision = 16)
    @NotNull
    @Nonnull
    public Short getRed() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>public.rgba.green</code>.
     */
    public RgbaRecord setGreen(@Nonnull Short value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.rgba.green</code>.
     */
    @Column(name = "green", nullable = false, precision = 16)
    @NotNull
    @Nonnull
    public Short getGreen() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>public.rgba.blue</code>.
     */
    public RgbaRecord setBlue(@Nonnull Short value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.rgba.blue</code>.
     */
    @Column(name = "blue", nullable = false, precision = 16)
    @NotNull
    @Nonnull
    public Short getBlue() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>public.rgba.alpha</code>.
     */
    public RgbaRecord setAlpha(@Nonnull Float value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.rgba.alpha</code>.
     */
    @Column(name = "alpha", nullable = false, precision = 24)
    @NotNull
    @Nonnull
    public Float getAlpha() {
        return (Float) get(4);
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
    public Row5<Long, Short, Short, Short, Float> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    @Nonnull
    public Row5<Long, Short, Short, Short, Float> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    @Nonnull
    public Field<Long> field1() {
        return Rgba.RGBA.ID;
    }

    @Override
    @Nonnull
    public Field<Short> field2() {
        return Rgba.RGBA.RED;
    }

    @Override
    @Nonnull
    public Field<Short> field3() {
        return Rgba.RGBA.GREEN;
    }

    @Override
    @Nonnull
    public Field<Short> field4() {
        return Rgba.RGBA.BLUE;
    }

    @Override
    @Nonnull
    public Field<Float> field5() {
        return Rgba.RGBA.ALPHA;
    }

    @Override
    @Nonnull
    public Long component1() {
        return getId();
    }

    @Override
    @Nonnull
    public Short component2() {
        return getRed();
    }

    @Override
    @Nonnull
    public Short component3() {
        return getGreen();
    }

    @Override
    @Nonnull
    public Short component4() {
        return getBlue();
    }

    @Override
    @Nonnull
    public Float component5() {
        return getAlpha();
    }

    @Override
    @Nonnull
    public Long value1() {
        return getId();
    }

    @Override
    @Nonnull
    public Short value2() {
        return getRed();
    }

    @Override
    @Nonnull
    public Short value3() {
        return getGreen();
    }

    @Override
    @Nonnull
    public Short value4() {
        return getBlue();
    }

    @Override
    @Nonnull
    public Float value5() {
        return getAlpha();
    }

    @Override
    @Nonnull
    public RgbaRecord value1(@Nonnull Long value) {
        setId(value);
        return this;
    }

    @Override
    @Nonnull
    public RgbaRecord value2(@Nonnull Short value) {
        setRed(value);
        return this;
    }

    @Override
    @Nonnull
    public RgbaRecord value3(@Nonnull Short value) {
        setGreen(value);
        return this;
    }

    @Override
    @Nonnull
    public RgbaRecord value4(@Nonnull Short value) {
        setBlue(value);
        return this;
    }

    @Override
    @Nonnull
    public RgbaRecord value5(@Nonnull Float value) {
        setAlpha(value);
        return this;
    }

    @Override
    @Nonnull
    public RgbaRecord values(@Nonnull Long value1, @Nonnull Short value2, @Nonnull Short value3, @Nonnull Short value4, @Nonnull Float value5) {
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
     * Create a detached RgbaRecord
     */
    public RgbaRecord() {
        super(Rgba.RGBA);
    }

    /**
     * Create a detached, initialised RgbaRecord
     */
    @ConstructorProperties({ "id", "red", "green", "blue", "alpha" })
    public RgbaRecord(@Nonnull Long id, @Nonnull Short red, @Nonnull Short green, @Nonnull Short blue, @Nonnull Float alpha) {
        super(Rgba.RGBA);

        setId(id);
        setRed(red);
        setGreen(green);
        setBlue(blue);
        setAlpha(alpha);
    }
}
