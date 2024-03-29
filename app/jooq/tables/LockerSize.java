/*
 * This file is generated by jOOQ.
 */
package jooq.tables;


import jooq.Domains;
import jooq.Keys;
import jooq.Public;
import jooq.tables.Locker.LockerPath;
import jooq.tables.records.LockerSizeRecord;
import org.jooq.Record;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.processing.Generated;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


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
public class LockerSize extends TableImpl<LockerSizeRecord> {

    private static final long serialVersionUID = -1380157916;

    /**
     * The reference instance of <code>public.locker_size</code>
     */
    public static final LockerSize LOCKER_SIZE = new LockerSize();

    /**
     * The class holding records for this type
     */
    @Override
    @Nonnull
    public Class<LockerSizeRecord> getRecordType() {
        return LockerSizeRecord.class;
    }

    /**
     * The column <code>public.locker_size.id</code>.
     */
    public final TableField<LockerSizeRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.locker_size.name</code>.
     */
    public final TableField<LockerSizeRecord, String> NAME = createField(DSL.name("name"), Domains.DOMAIN_NAME.getDataType().nullable(false), this, "");

    /**
     * The column <code>public.locker_size.length</code>.
     */
    public final TableField<LockerSizeRecord, Double> LENGTH = createField(DSL.name("length"), Domains.DOMAIN_DIMENSION.getDataType().nullable(false), this, "");

    /**
     * The column <code>public.locker_size.width</code>.
     */
    public final TableField<LockerSizeRecord, Double> WIDTH = createField(DSL.name("width"), Domains.DOMAIN_DIMENSION.getDataType().nullable(false), this, "");

    /**
     * The column <code>public.locker_size.height</code>.
     */
    public final TableField<LockerSizeRecord, Double> HEIGHT = createField(DSL.name("height"), Domains.DOMAIN_DIMENSION.getDataType().nullable(false), this, "");

    private LockerSize(Name alias, Table<LockerSizeRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private LockerSize(Name alias, Table<LockerSizeRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>public.locker_size</code> table reference
     */
    public LockerSize(String alias) {
        this(DSL.name(alias), LOCKER_SIZE);
    }

    /**
     * Create an aliased <code>public.locker_size</code> table reference
     */
    public LockerSize(Name alias) {
        this(alias, LOCKER_SIZE);
    }

    /**
     * Create a <code>public.locker_size</code> table reference
     */
    public LockerSize() {
        this(DSL.name("locker_size"), null);
    }

    public <O extends Record> LockerSize(Table<O> path, ForeignKey<O, LockerSizeRecord> childPath, InverseForeignKey<O, LockerSizeRecord> parentPath) {
        super(path, childPath, parentPath, LOCKER_SIZE);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class LockerSizePath extends LockerSize implements Path<LockerSizeRecord> {

        private static final long serialVersionUID = -1380157916;
        public <O extends Record> LockerSizePath(Table<O> path, ForeignKey<O, LockerSizeRecord> childPath, InverseForeignKey<O, LockerSizeRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private LockerSizePath(Name alias, Table<LockerSizeRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public LockerSizePath as(String alias) {
            return new LockerSizePath(DSL.name(alias), this);
        }

        @Override
        public LockerSizePath as(Name alias) {
            return new LockerSizePath(alias, this);
        }

        @Override
        public LockerSizePath as(Table<?> alias) {
            return new LockerSizePath(alias.getQualifiedName(), this);
        }
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    @Nonnull
    public Identity<LockerSizeRecord, Long> getIdentity() {
        return (Identity<LockerSizeRecord, Long>) super.getIdentity();
    }

    @Override
    @Nonnull
    public UniqueKey<LockerSizeRecord> getPrimaryKey() {
        return Keys.PK_LOCKER_SIZE;
    }

    @Override
    @Nonnull
    public List<UniqueKey<LockerSizeRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.UNIQUE_DIMENSION_ON_DIMENSIONS);
    }

    private transient LockerPath _locker;

    /**
     * Get the implicit to-many join path to the <code>public.locker</code>
     * table
     */
    public LockerPath locker() {
        if (_locker == null)
            _locker = new LockerPath(this, null, Keys.LOCKER__FK_LOCKER_TO_CONTAINER.getInverseKey());

        return _locker;
    }

    @Override
    @Nonnull
    public LockerSize as(String alias) {
        return new LockerSize(DSL.name(alias), this);
    }

    @Override
    @Nonnull
    public LockerSize as(Name alias) {
        return new LockerSize(alias, this);
    }

    @Override
    @Nonnull
    public LockerSize as(Table<?> alias) {
        return new LockerSize(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @Nonnull
    public LockerSize rename(String name) {
        return new LockerSize(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @Nonnull
    public LockerSize rename(Name name) {
        return new LockerSize(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @Nonnull
    public LockerSize rename(Table<?> name) {
        return new LockerSize(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    public LockerSize where(Condition condition) {
        return new LockerSize(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    public LockerSize where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    public LockerSize where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    public LockerSize where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    @PlainSQL
    public LockerSize where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    @PlainSQL
    public LockerSize where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    @PlainSQL
    public LockerSize where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    @PlainSQL
    public LockerSize where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    public LockerSize whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    public LockerSize whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
