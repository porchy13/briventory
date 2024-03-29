/*
 * This file is generated by jOOQ.
 */
package jooq.tables;


import jooq.Keys;
import jooq.Public;
import jooq.tables.Container.ContainerPath;
import jooq.tables.ContainerComposition.ContainerCompositionPath;
import jooq.tables.LockerSize.LockerSizePath;
import jooq.tables.records.LockerRecord;
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
public class Locker extends TableImpl<LockerRecord> {

    private static final long serialVersionUID = -875345319;

    /**
     * The reference instance of <code>public.locker</code>
     */
    public static final Locker LOCKER = new Locker();

    /**
     * The class holding records for this type
     */
    @Override
    @Nonnull
    public Class<LockerRecord> getRecordType() {
        return LockerRecord.class;
    }

    /**
     * The column <code>public.locker.id</code>.
     */
    public final TableField<LockerRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.locker.id_locker_size</code>.
     */
    public final TableField<LockerRecord, Long> ID_LOCKER_SIZE = createField(DSL.name("id_locker_size"), SQLDataType.BIGINT, this, "");

    private Locker(Name alias, Table<LockerRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Locker(Name alias, Table<LockerRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>public.locker</code> table reference
     */
    public Locker(String alias) {
        this(DSL.name(alias), LOCKER);
    }

    /**
     * Create an aliased <code>public.locker</code> table reference
     */
    public Locker(Name alias) {
        this(alias, LOCKER);
    }

    /**
     * Create a <code>public.locker</code> table reference
     */
    public Locker() {
        this(DSL.name("locker"), null);
    }

    public <O extends Record> Locker(Table<O> path, ForeignKey<O, LockerRecord> childPath, InverseForeignKey<O, LockerRecord> parentPath) {
        super(path, childPath, parentPath, LOCKER);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class LockerPath extends Locker implements Path<LockerRecord> {

        private static final long serialVersionUID = -875345319;
        public <O extends Record> LockerPath(Table<O> path, ForeignKey<O, LockerRecord> childPath, InverseForeignKey<O, LockerRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private LockerPath(Name alias, Table<LockerRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public LockerPath as(String alias) {
            return new LockerPath(DSL.name(alias), this);
        }

        @Override
        public LockerPath as(Name alias) {
            return new LockerPath(alias, this);
        }

        @Override
        public LockerPath as(Table<?> alias) {
            return new LockerPath(alias.getQualifiedName(), this);
        }
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    @Nonnull
    public Identity<LockerRecord, Long> getIdentity() {
        return (Identity<LockerRecord, Long>) super.getIdentity();
    }

    @Override
    @Nonnull
    public UniqueKey<LockerRecord> getPrimaryKey() {
        return Keys.PK_LOCKER;
    }

    @Override
    @Nonnull
    public List<ForeignKey<LockerRecord, ?>> getReferences() {
        return Arrays.asList(Keys.LOCKER__FK_LOCKER_TO_CONTAINER);
    }

    private transient LockerSizePath _lockerSize;

    /**
     * Get the implicit join path to the <code>public.locker_size</code> table.
     */
    public LockerSizePath lockerSize() {
        if (_lockerSize == null)
            _lockerSize = new LockerSizePath(this, Keys.LOCKER__FK_LOCKER_TO_CONTAINER, null);

        return _lockerSize;
    }

    private transient ContainerCompositionPath _containerComposition;

    /**
     * Get the implicit to-many join path to the
     * <code>public.container_composition</code> table
     */
    public ContainerCompositionPath containerComposition() {
        if (_containerComposition == null)
            _containerComposition = new ContainerCompositionPath(this, null, Keys.CONTAINER_COMPOSITION__FK_CONTAINER_COMPOSITION_TO_LOCKER.getInverseKey());

        return _containerComposition;
    }

    /**
     * Get the implicit many-to-many join path to the
     * <code>public.container</code> table
     */
    public ContainerPath container() {
        return containerComposition().container();
    }

    @Override
    @Nonnull
    public Locker as(String alias) {
        return new Locker(DSL.name(alias), this);
    }

    @Override
    @Nonnull
    public Locker as(Name alias) {
        return new Locker(alias, this);
    }

    @Override
    @Nonnull
    public Locker as(Table<?> alias) {
        return new Locker(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @Nonnull
    public Locker rename(String name) {
        return new Locker(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @Nonnull
    public Locker rename(Name name) {
        return new Locker(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @Nonnull
    public Locker rename(Table<?> name) {
        return new Locker(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    public Locker where(Condition condition) {
        return new Locker(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    public Locker where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    public Locker where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    public Locker where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    @PlainSQL
    public Locker where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    @PlainSQL
    public Locker where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    @PlainSQL
    public Locker where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    @PlainSQL
    public Locker where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    public Locker whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    public Locker whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
