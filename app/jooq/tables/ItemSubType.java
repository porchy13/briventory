/*
 * This file is generated by jOOQ.
 */
package jooq.tables;


import jooq.Keys;
import jooq.Public;
import jooq.tables.records.ItemSubTypeRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.processing.Generated;
import java.util.Collection;


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
public class ItemSubType extends TableImpl<ItemSubTypeRecord> {

    private static final long serialVersionUID = -1331979881;

    /**
     * The reference instance of <code>public.item_sub_type</code>
     */
    public static final ItemSubType ITEM_SUB_TYPE = new ItemSubType();

    /**
     * The class holding records for this type
     */
    @Override
    @Nonnull
    public Class<ItemSubTypeRecord> getRecordType() {
        return ItemSubTypeRecord.class;
    }

    /**
     * The column <code>public.item_sub_type.id_base_item_type</code>.
     */
    public final TableField<ItemSubTypeRecord, Long> ID_BASE_ITEM_TYPE = createField(DSL.name("id_base_item_type"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.item_sub_type.id_sub_item_type</code>.
     */
    public final TableField<ItemSubTypeRecord, Long> ID_SUB_ITEM_TYPE = createField(DSL.name("id_sub_item_type"), SQLDataType.BIGINT.nullable(false), this, "");

    private ItemSubType(Name alias, Table<ItemSubTypeRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private ItemSubType(Name alias, Table<ItemSubTypeRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>public.item_sub_type</code> table reference
     */
    public ItemSubType(String alias) {
        this(DSL.name(alias), ITEM_SUB_TYPE);
    }

    /**
     * Create an aliased <code>public.item_sub_type</code> table reference
     */
    public ItemSubType(Name alias) {
        this(alias, ITEM_SUB_TYPE);
    }

    /**
     * Create a <code>public.item_sub_type</code> table reference
     */
    public ItemSubType() {
        this(DSL.name("item_sub_type"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    @Nonnull
    public UniqueKey<ItemSubTypeRecord> getPrimaryKey() {
        return Keys.PK_ITEM_SUB_TYPE;
    }

    @Override
    @Nonnull
    public ItemSubType as(String alias) {
        return new ItemSubType(DSL.name(alias), this);
    }

    @Override
    @Nonnull
    public ItemSubType as(Name alias) {
        return new ItemSubType(alias, this);
    }

    @Override
    @Nonnull
    public ItemSubType as(Table<?> alias) {
        return new ItemSubType(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @Nonnull
    public ItemSubType rename(String name) {
        return new ItemSubType(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @Nonnull
    public ItemSubType rename(Name name) {
        return new ItemSubType(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @Nonnull
    public ItemSubType rename(Table<?> name) {
        return new ItemSubType(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    public ItemSubType where(Condition condition) {
        return new ItemSubType(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    public ItemSubType where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    public ItemSubType where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    public ItemSubType where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    @PlainSQL
    public ItemSubType where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    @PlainSQL
    public ItemSubType where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    @PlainSQL
    public ItemSubType where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    @PlainSQL
    public ItemSubType where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    public ItemSubType whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    public ItemSubType whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
