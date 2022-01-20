/*
 * This file is generated by jOOQ.
 */
package jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.processing.Generated;

import jooq.Keys;
import jooq.Public;
import jooq.tables.records.ColorInfoRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


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
public class ColorInfo extends TableImpl<ColorInfoRecord> {

    private static final long serialVersionUID = -1121494796;

    /**
     * The reference instance of <code>public.color_info</code>
     */
    public static final ColorInfo COLOR_INFO = new ColorInfo();

    /**
     * The class holding records for this type
     */
    @Override
    @Nonnull
    public Class<ColorInfoRecord> getRecordType() {
        return ColorInfoRecord.class;
    }

    /**
     * The column <code>public.color_info.id_color</code>.
     */
    public final TableField<ColorInfoRecord, Long> ID_COLOR = createField(DSL.name("id_color"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.color_info.id_color_source</code>.
     */
    public final TableField<ColorInfoRecord, Long> ID_COLOR_SOURCE = createField(DSL.name("id_color_source"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.color_info.id_rgba</code>.
     */
    public final TableField<ColorInfoRecord, Long> ID_RGBA = createField(DSL.name("id_rgba"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.color_info.name</code>.
     */
    public final TableField<ColorInfoRecord, String> NAME = createField(DSL.name("name"), jooq.Domains.DOMAIN_NAME.getDataType(), this, "");

    /**
     * The column <code>public.color_info.color_id</code>.
     */
    public final TableField<ColorInfoRecord, Short> COLOR_ID = createField(DSL.name("color_id"), SQLDataType.SMALLINT.nullable(false), this, "");

    private ColorInfo(Name alias, Table<ColorInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private ColorInfo(Name alias, Table<ColorInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.color_info</code> table reference
     */
    public ColorInfo(String alias) {
        this(DSL.name(alias), COLOR_INFO);
    }

    /**
     * Create an aliased <code>public.color_info</code> table reference
     */
    public ColorInfo(Name alias) {
        this(alias, COLOR_INFO);
    }

    /**
     * Create a <code>public.color_info</code> table reference
     */
    public ColorInfo() {
        this(DSL.name("color_info"), null);
    }

    public <O extends Record> ColorInfo(Table<O> child, ForeignKey<O, ColorInfoRecord> key) {
        super(child, key, COLOR_INFO);
    }

    @Override
    @Nonnull
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    @Nonnull
    public UniqueKey<ColorInfoRecord> getPrimaryKey() {
        return Keys.PK_COLOR_INFO;
    }

    @Override
    @Nonnull
    public List<UniqueKey<ColorInfoRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.UNIQUE_COLOR_INFO_ON_COLOR_SOURCE_AND_RGBA);
    }

    @Override
    @Nonnull
    public List<ForeignKey<ColorInfoRecord, ?>> getReferences() {
        return Arrays.asList(Keys.COLOR_INFO__FK_COLOR_INFO_TO_COLOR, Keys.COLOR_INFO__FK_COLOR_INFO_TO_COLOR_SOURCE, Keys.COLOR_INFO__FK_COLOR_INFO_TO_RGBA);
    }

    private transient Color _color;
    private transient ColorSource _colorSource;
    private transient Rgba _rgba;

    /**
     * Get the implicit join path to the <code>public.color</code> table.
     */
    public Color color() {
        if (_color == null)
            _color = new Color(this, Keys.COLOR_INFO__FK_COLOR_INFO_TO_COLOR);

        return _color;
    }

    /**
     * Get the implicit join path to the <code>public.color_source</code> table.
     */
    public ColorSource colorSource() {
        if (_colorSource == null)
            _colorSource = new ColorSource(this, Keys.COLOR_INFO__FK_COLOR_INFO_TO_COLOR_SOURCE);

        return _colorSource;
    }

    /**
     * Get the implicit join path to the <code>public.rgba</code> table.
     */
    public Rgba rgba() {
        if (_rgba == null)
            _rgba = new Rgba(this, Keys.COLOR_INFO__FK_COLOR_INFO_TO_RGBA);

        return _rgba;
    }

    @Override
    @Nonnull
    public ColorInfo as(String alias) {
        return new ColorInfo(DSL.name(alias), this);
    }

    @Override
    @Nonnull
    public ColorInfo as(Name alias) {
        return new ColorInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    @Nonnull
    public ColorInfo rename(String name) {
        return new ColorInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @Nonnull
    public ColorInfo rename(Name name) {
        return new ColorInfo(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    @Nonnull
    public Row5<Long, Long, Long, String, Short> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
