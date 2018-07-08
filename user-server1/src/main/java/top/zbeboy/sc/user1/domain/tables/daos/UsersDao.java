/*
 * This file is generated by jOOQ.
*/
package top.zbeboy.sc.user1.domain.tables.daos;


import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import top.zbeboy.sc.user1.domain.tables.Users;
import top.zbeboy.sc.user1.domain.tables.records.UsersRecord;


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
@Repository
public class UsersDao extends DAOImpl<UsersRecord, top.zbeboy.sc.user1.domain.tables.pojos.Users, String> {

    /**
     * Create a new UsersDao without any configuration
     */
    public UsersDao() {
        super(Users.USERS, top.zbeboy.sc.user1.domain.tables.pojos.Users.class);
    }

    /**
     * Create a new UsersDao with an attached configuration
     */
    @Autowired
    public UsersDao(Configuration configuration) {
        super(Users.USERS, top.zbeboy.sc.user1.domain.tables.pojos.Users.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(top.zbeboy.sc.user1.domain.tables.pojos.Users object) {
        return object.getUsername();
    }

    /**
     * Fetch records that have <code>username IN (values)</code>
     */
    public List<top.zbeboy.sc.user1.domain.tables.pojos.Users> fetchByUsername(String... values) {
        return fetch(Users.USERS.USERNAME, values);
    }

    /**
     * Fetch a unique record that has <code>username = value</code>
     */
    public top.zbeboy.sc.user1.domain.tables.pojos.Users fetchOneByUsername(String value) {
        return fetchOne(Users.USERS.USERNAME, value);
    }

    /**
     * Fetch records that have <code>password IN (values)</code>
     */
    public List<top.zbeboy.sc.user1.domain.tables.pojos.Users> fetchByPassword(String... values) {
        return fetch(Users.USERS.PASSWORD, values);
    }

    /**
     * Fetch records that have <code>enabled IN (values)</code>
     */
    public List<top.zbeboy.sc.user1.domain.tables.pojos.Users> fetchByEnabled(Byte... values) {
        return fetch(Users.USERS.ENABLED, values);
    }

    /**
     * Fetch records that have <code>real_name IN (values)</code>
     */
    public List<top.zbeboy.sc.user1.domain.tables.pojos.Users> fetchByRealName(String... values) {
        return fetch(Users.USERS.REAL_NAME, values);
    }

    /**
     * Fetch records that have <code>mobile IN (values)</code>
     */
    public List<top.zbeboy.sc.user1.domain.tables.pojos.Users> fetchByMobile(String... values) {
        return fetch(Users.USERS.MOBILE, values);
    }

    /**
     * Fetch a unique record that has <code>mobile = value</code>
     */
    public top.zbeboy.sc.user1.domain.tables.pojos.Users fetchOneByMobile(String value) {
        return fetchOne(Users.USERS.MOBILE, value);
    }

    /**
     * Fetch records that have <code>avatar IN (values)</code>
     */
    public List<top.zbeboy.sc.user1.domain.tables.pojos.Users> fetchByAvatar(String... values) {
        return fetch(Users.USERS.AVATAR, values);
    }

    /**
     * Fetch records that have <code>verify_mailbox IN (values)</code>
     */
    public List<top.zbeboy.sc.user1.domain.tables.pojos.Users> fetchByVerifyMailbox(Byte... values) {
        return fetch(Users.USERS.VERIFY_MAILBOX, values);
    }

    /**
     * Fetch records that have <code>mailbox_verify_code IN (values)</code>
     */
    public List<top.zbeboy.sc.user1.domain.tables.pojos.Users> fetchByMailboxVerifyCode(String... values) {
        return fetch(Users.USERS.MAILBOX_VERIFY_CODE, values);
    }

    /**
     * Fetch records that have <code>password_reset_key IN (values)</code>
     */
    public List<top.zbeboy.sc.user1.domain.tables.pojos.Users> fetchByPasswordResetKey(String... values) {
        return fetch(Users.USERS.PASSWORD_RESET_KEY, values);
    }

    /**
     * Fetch records that have <code>mailbox_verify_valid IN (values)</code>
     */
    public List<top.zbeboy.sc.user1.domain.tables.pojos.Users> fetchByMailboxVerifyValid(Timestamp... values) {
        return fetch(Users.USERS.MAILBOX_VERIFY_VALID, values);
    }

    /**
     * Fetch records that have <code>password_reset_key_valid IN (values)</code>
     */
    public List<top.zbeboy.sc.user1.domain.tables.pojos.Users> fetchByPasswordResetKeyValid(Timestamp... values) {
        return fetch(Users.USERS.PASSWORD_RESET_KEY_VALID, values);
    }

    /**
     * Fetch records that have <code>lang_key IN (values)</code>
     */
    public List<top.zbeboy.sc.user1.domain.tables.pojos.Users> fetchByLangKey(String... values) {
        return fetch(Users.USERS.LANG_KEY, values);
    }

    /**
     * Fetch records that have <code>join_date IN (values)</code>
     */
    public List<top.zbeboy.sc.user1.domain.tables.pojos.Users> fetchByJoinDate(Date... values) {
        return fetch(Users.USERS.JOIN_DATE, values);
    }
}
