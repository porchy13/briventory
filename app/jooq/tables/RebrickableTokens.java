/*
 * This file is generated by jOOQ.
 */
package jooq.tables;


import jooq.Domains;
import jooq.Keys;
import jooq.Public;
import jooq.tables.Account.AccountPath;
import jooq.tables.records.RebrickableTokensRecord;
import org.jooq.Record;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.processing.Generated;
import java.time.LocalDate;
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
public class RebrickableTokens extends TableImpl<RebrickableTokensRecord> {

    private static final long serialVersionUID = 424911443;

    /**
     * The reference instance of <code>public.rebrickable_tokens</code>
     */
    public static final RebrickableTokens REBRICKABLE_TOKENS = new RebrickableTokens();

    /**
     * The class holding records for this type
     */
    @Override
    @Nonnull
    public Class<RebrickableTokensRecord> getRecordType() {
        return RebrickableTokensRecord.class;
    }

    /**
     * The column <code>public.rebrickable_tokens.id_account</code>.
     */
    public final TableField<RebrickableTokensRecord, Long> ID_ACCOUNT = createField(DSL.name("id_account"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.rebrickable_tokens.key</code>.
     */
    public final TableField<RebrickableTokensRecord, String> KEY = createField(DSL.name("key"), Domains.DOMAIN_TOKEN.getDataType().nullable(false), this, "");

    /**
     * The column <code>public.rebrickable_tokens.valid_until</code>.
     */
    public final TableField<RebrickableTokensRecord, LocalDate> VALID_UNTIL = createField(DSL.name("valid_until"), SQLDataType.LOCALDATE.nullable(false).defaultValue(DSL.field(DSL.raw("(now() + '1 year'::interval)"), SQLDataType.LOCALDATE)), this, "");

    private RebrickableTokens(Name alias, Table<RebrickableTokensRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private RebrickableTokens(Name alias, Table<RebrickableTokensRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>public.rebrickable_tokens</code> table reference
     */
    public RebrickableTokens(String alias) {
        this(DSL.name(alias), REBRICKABLE_TOKENS);
    }

    /**
     * Create an aliased <code>public.rebrickable_tokens</code> table reference
     */
    public RebrickableTokens(Name alias) {
        this(alias, REBRICKABLE_TOKENS);
    }

    /**
     * Create a <code>public.rebrickable_tokens</code> table reference
     */
    public RebrickableTokens() {
        this(DSL.name("rebrickable_tokens"), null);
    }

    public <O extends Record> RebrickableTokens(Table<O> path, ForeignKey<O, RebrickableTokensRecord> childPath, InverseForeignKey<O, RebrickableTokensRecord> parentPath) {
        super(path, childPath, parentPath, REBRICKABLE_TOKENS);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class RebrickableTokensPath extends RebrickableTokens implements Path<RebrickableTokensRecord> {

        private static final long serialVersionUID = 424911443;
        public <O extends Record> RebrickableTokensPath(Table<O> path, ForeignKey<O, RebrickableTokensRecord> childPath, InverseForeignKey<O, RebrickableTokensRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private RebrickableTokensPath(Name alias, Table<RebrickableTokensRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public RebrickableTokensPath as(String alias) {
            return new RebrickableTokensPath(DSL.name(alias), this);
        }

        @Override
        public RebrickableTokensPath as(Name alias) {
            return new RebrickableTokensPath(alias, this);
        }

        @Override
        public RebrickableTokensPath as(Table<?> alias) {
            return new RebrickableTokensPath(alias.getQualifiedName(), this);
        }
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    @Nonnull
    public UniqueKey<RebrickableTokensRecord> getPrimaryKey() {
        return Keys.PK_REBRICKABLE_TOKENS;
    }

    @Override
    @Nonnull
    public List<ForeignKey<RebrickableTokensRecord, ?>> getReferences() {
        return Arrays.asList(Keys.REBRICKABLE_TOKENS__FK_REBRICKABLE_TOKENS_TO_ACCOUNT);
    }

    private transient AccountPath _account;

    /**
     * Get the implicit join path to the <code>public.account</code> table.
     */
    public AccountPath account() {
        if (_account == null)
            _account = new AccountPath(this, Keys.REBRICKABLE_TOKENS__FK_REBRICKABLE_TOKENS_TO_ACCOUNT, null);

        return _account;
    }

    @Override
    @Nonnull
    public RebrickableTokens as(String alias) {
        return new RebrickableTokens(DSL.name(alias), this);
    }

    @Override
    @Nonnull
    public RebrickableTokens as(Name alias) {
        return new RebrickableTokens(alias, this);
    }

    @Override
    @Nonnull
    public RebrickableTokens as(Table<?> alias) {
        return new RebrickableTokens(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @Nonnull
    public RebrickableTokens rename(String name) {
        return new RebrickableTokens(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @Nonnull
    public RebrickableTokens rename(Name name) {
        return new RebrickableTokens(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @Nonnull
    public RebrickableTokens rename(Table<?> name) {
        return new RebrickableTokens(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    public RebrickableTokens where(Condition condition) {
        return new RebrickableTokens(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    public RebrickableTokens where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    public RebrickableTokens where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    public RebrickableTokens where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    @PlainSQL
    public RebrickableTokens where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    @PlainSQL
    public RebrickableTokens where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    @PlainSQL
    public RebrickableTokens where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    @PlainSQL
    public RebrickableTokens where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    public RebrickableTokens whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @Nonnull
    public RebrickableTokens whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
