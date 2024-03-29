/*
 * This file is generated by jOOQ.
 */
package jooq;


import jooq.tables.*;
import org.jooq.Catalog;
import org.jooq.Domain;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import javax.annotation.Nonnull;
import javax.annotation.processing.Generated;
import java.util.Arrays;
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
public class Public extends SchemaImpl {

    private static final long serialVersionUID = -619045886;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.account</code>.
     */
    public final Account ACCOUNT = Account.ACCOUNT;

    /**
     * The table <code>public.administrator</code>.
     */
    public final Administrator ADMINISTRATOR = Administrator.ADMINISTRATOR;

    /**
     * The table <code>public.allowed_item_types</code>.
     */
    public final AllowedItemTypes ALLOWED_ITEM_TYPES = AllowedItemTypes.ALLOWED_ITEM_TYPES;

    /**
     * The table <code>public.bricklink_tokens</code>.
     */
    public final BricklinkTokens BRICKLINK_TOKENS = BricklinkTokens.BRICKLINK_TOKENS;

    /**
     * The table <code>public.brickset_tokens</code>.
     */
    public final BricksetTokens BRICKSET_TOKENS = BricksetTokens.BRICKSET_TOKENS;

    /**
     * The table <code>public.color</code>.
     */
    public final Color COLOR = Color.COLOR;

    /**
     * The table <code>public.color_info</code>.
     */
    public final ColorInfo COLOR_INFO = ColorInfo.COLOR_INFO;

    /**
     * The table <code>public.color_source</code>.
     */
    public final ColorSource COLOR_SOURCE = ColorSource.COLOR_SOURCE;

    /**
     * The table <code>public.configuration</code>.
     */
    public final Configuration CONFIGURATION = Configuration.CONFIGURATION;

    /**
     * The table <code>public.constants</code>.
     */
    public final Constants CONSTANTS = Constants.CONSTANTS;

    /**
     * The table <code>public.container</code>.
     */
    public final Container CONTAINER = Container.CONTAINER;

    /**
     * The table <code>public.container_composition</code>.
     */
    public final ContainerComposition CONTAINER_COMPOSITION = ContainerComposition.CONTAINER_COMPOSITION;

    /**
     * The table <code>public.container_type</code>.
     */
    public final ContainerType CONTAINER_TYPE = ContainerType.CONTAINER_TYPE;

    /**
     * The table <code>public.item_sub_type</code>.
     */
    public final ItemSubType ITEM_SUB_TYPE = ItemSubType.ITEM_SUB_TYPE;

    /**
     * item_type is considered as a table of constants, there is not sequence.
     */
    public final ItemType ITEM_TYPE = ItemType.ITEM_TYPE;

    /**
     * The table <code>public.locked_account</code>.
     */
    public final LockedAccount LOCKED_ACCOUNT = LockedAccount.LOCKED_ACCOUNT;

    /**
     * The table <code>public.locker</code>.
     */
    public final Locker LOCKER = Locker.LOCKER;

    /**
     * The table <code>public.locker_size</code>.
     */
    public final LockerSize LOCKER_SIZE = LockerSize.LOCKER_SIZE;

    /**
     * The table <code>public.private_container</code>.
     */
    public final PrivateContainer PRIVATE_CONTAINER = PrivateContainer.PRIVATE_CONTAINER;

    /**
     * The table <code>public.rebrickable_tokens</code>.
     */
    public final RebrickableTokens REBRICKABLE_TOKENS = RebrickableTokens.REBRICKABLE_TOKENS;

    /**
     * The table <code>public.rgba</code>.
     */
    public final Rgba RGBA = Rgba.RGBA;

    /**
     * The table <code>public.shared_container</code>.
     */
    public final SharedContainer SHARED_CONTAINER = SharedContainer.SHARED_CONTAINER;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    @Nonnull
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    @Nonnull
    public final List<Domain<?>> getDomains() {
        return Arrays.asList(
            Domains.DOMAIN_ALPHA_COMPONENT,
            Domains.DOMAIN_COLOR_COMPONENT,
            Domains.DOMAIN_DIMENSION,
            Domains.DOMAIN_EMAIL,
            Domains.DOMAIN_FORMAT_STRING,
            Domains.DOMAIN_NAME,
            Domains.DOMAIN_PASSWORD,
            Domains.DOMAIN_REVISION,
            Domains.DOMAIN_TOKEN,
            Domains.DOMAIN_URL,
            Domains.DOMAIN_USERNAME
        );
    }

    @Override
    @Nonnull
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Account.ACCOUNT,
            Administrator.ADMINISTRATOR,
            AllowedItemTypes.ALLOWED_ITEM_TYPES,
            BricklinkTokens.BRICKLINK_TOKENS,
            BricksetTokens.BRICKSET_TOKENS,
            Color.COLOR,
            ColorInfo.COLOR_INFO,
            ColorSource.COLOR_SOURCE,
            Configuration.CONFIGURATION,
            Constants.CONSTANTS,
            Container.CONTAINER,
            ContainerComposition.CONTAINER_COMPOSITION,
            ContainerType.CONTAINER_TYPE,
            ItemSubType.ITEM_SUB_TYPE,
            ItemType.ITEM_TYPE,
            LockedAccount.LOCKED_ACCOUNT,
            Locker.LOCKER,
            LockerSize.LOCKER_SIZE,
            PrivateContainer.PRIVATE_CONTAINER,
            RebrickableTokens.REBRICKABLE_TOKENS,
            Rgba.RGBA,
            SharedContainer.SHARED_CONTAINER
        );
    }
}
