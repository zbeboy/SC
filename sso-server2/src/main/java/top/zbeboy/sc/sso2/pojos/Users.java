package top.zbeboy.sc.sso2.pojos;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

public class Users implements Serializable {

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Byte getEnabled() {
        return enabled;
    }

    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Byte getVerifyMailbox() {
        return verifyMailbox;
    }

    public void setVerifyMailbox(Byte verifyMailbox) {
        this.verifyMailbox = verifyMailbox;
    }

    public String getMailboxVerifyCode() {
        return mailboxVerifyCode;
    }

    public void setMailboxVerifyCode(String mailboxVerifyCode) {
        this.mailboxVerifyCode = mailboxVerifyCode;
    }

    public String getPasswordResetKey() {
        return passwordResetKey;
    }

    public void setPasswordResetKey(String passwordResetKey) {
        this.passwordResetKey = passwordResetKey;
    }

    public Timestamp getMailboxVerifyValid() {
        return mailboxVerifyValid;
    }

    public void setMailboxVerifyValid(Timestamp mailboxVerifyValid) {
        this.mailboxVerifyValid = mailboxVerifyValid;
    }

    public Timestamp getPasswordResetKeyValid() {
        return passwordResetKeyValid;
    }

    public void setPasswordResetKeyValid(Timestamp passwordResetKeyValid) {
        this.passwordResetKeyValid = passwordResetKeyValid;
    }

    public String getLangKey() {
        return langKey;
    }

    public void setLangKey(String langKey) {
        this.langKey = langKey;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
}
