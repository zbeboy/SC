/*
 * This file is generated by jOOQ.
*/
package top.zbeboy.sc.user2.domain.tables.pojos;


import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


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
public class Users implements Serializable {

    private static final long serialVersionUID = -4556190;

    private String    username;
    private String    password;
    private Byte      enabled;
    private String    realName;
    private String    mobile;
    private String    avatar;
    private Byte      verifyMailbox;
    private String    mailboxVerifyCode;
    private String    passwordResetKey;
    private Timestamp mailboxVerifyValid;
    private Timestamp passwordResetKeyValid;
    private String    langKey;
    private Date      joinDate;

    public Users() {}

    public Users(Users value) {
        this.username = value.username;
        this.password = value.password;
        this.enabled = value.enabled;
        this.realName = value.realName;
        this.mobile = value.mobile;
        this.avatar = value.avatar;
        this.verifyMailbox = value.verifyMailbox;
        this.mailboxVerifyCode = value.mailboxVerifyCode;
        this.passwordResetKey = value.passwordResetKey;
        this.mailboxVerifyValid = value.mailboxVerifyValid;
        this.passwordResetKeyValid = value.passwordResetKeyValid;
        this.langKey = value.langKey;
        this.joinDate = value.joinDate;
    }

    public Users(
        String    username,
        String    password,
        Byte      enabled,
        String    realName,
        String    mobile,
        String    avatar,
        Byte      verifyMailbox,
        String    mailboxVerifyCode,
        String    passwordResetKey,
        Timestamp mailboxVerifyValid,
        Timestamp passwordResetKeyValid,
        String    langKey,
        Date      joinDate
    ) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.realName = realName;
        this.mobile = mobile;
        this.avatar = avatar;
        this.verifyMailbox = verifyMailbox;
        this.mailboxVerifyCode = mailboxVerifyCode;
        this.passwordResetKey = passwordResetKey;
        this.mailboxVerifyValid = mailboxVerifyValid;
        this.passwordResetKeyValid = passwordResetKeyValid;
        this.langKey = langKey;
        this.joinDate = joinDate;
    }

    @NotNull
    @Size(max = 64)
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @NotNull
    @Size(max = 300)
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @NotNull
    public Byte getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    @Size(max = 30)
    public String getRealName() {
        return this.realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @NotNull
    @Size(max = 15)
    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Size(max = 500)
    public String getAvatar() {
        return this.avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Byte getVerifyMailbox() {
        return this.verifyMailbox;
    }

    public void setVerifyMailbox(Byte verifyMailbox) {
        this.verifyMailbox = verifyMailbox;
    }

    @Size(max = 20)
    public String getMailboxVerifyCode() {
        return this.mailboxVerifyCode;
    }

    public void setMailboxVerifyCode(String mailboxVerifyCode) {
        this.mailboxVerifyCode = mailboxVerifyCode;
    }

    @Size(max = 20)
    public String getPasswordResetKey() {
        return this.passwordResetKey;
    }

    public void setPasswordResetKey(String passwordResetKey) {
        this.passwordResetKey = passwordResetKey;
    }

    public Timestamp getMailboxVerifyValid() {
        return this.mailboxVerifyValid;
    }

    public void setMailboxVerifyValid(Timestamp mailboxVerifyValid) {
        this.mailboxVerifyValid = mailboxVerifyValid;
    }

    public Timestamp getPasswordResetKeyValid() {
        return this.passwordResetKeyValid;
    }

    public void setPasswordResetKeyValid(Timestamp passwordResetKeyValid) {
        this.passwordResetKeyValid = passwordResetKeyValid;
    }

    @Size(max = 20)
    public String getLangKey() {
        return this.langKey;
    }

    public void setLangKey(String langKey) {
        this.langKey = langKey;
    }

    public Date getJoinDate() {
        return this.joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Users (");

        sb.append(username);
        sb.append(", ").append(password);
        sb.append(", ").append(enabled);
        sb.append(", ").append(realName);
        sb.append(", ").append(mobile);
        sb.append(", ").append(avatar);
        sb.append(", ").append(verifyMailbox);
        sb.append(", ").append(mailboxVerifyCode);
        sb.append(", ").append(passwordResetKey);
        sb.append(", ").append(mailboxVerifyValid);
        sb.append(", ").append(passwordResetKeyValid);
        sb.append(", ").append(langKey);
        sb.append(", ").append(joinDate);

        sb.append(")");
        return sb.toString();
    }
}