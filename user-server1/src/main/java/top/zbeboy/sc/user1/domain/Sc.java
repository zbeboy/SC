/*
 * This file is generated by jOOQ.
*/
package top.zbeboy.sc.user1.domain;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import top.zbeboy.sc.user1.domain.tables.Users;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sc extends SchemaImpl {

    private static final long serialVersionUID = 301805682;

    /**
     * The reference instance of <code>sc</code>
     */
    public static final Sc SC = new Sc();

    /**
     * The table <code>sc.users</code>.
     */
    public final Users USERS = top.zbeboy.sc.user1.domain.tables.Users.USERS;

    /**
     * No further instances allowed
     */
    private Sc() {
        super("sc", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Users.USERS);
    }
}
