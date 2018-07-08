package top.zbeboy.sc.sso1.service;

import top.zbeboy.sc.sso1.pojos.Users;

public interface SsoService {

    /**
     * 检查用户
     *
     * @param username 账号
     * @param password 密码
     * @return 用户
     */
    Users checkUser(String username, String password);
}
