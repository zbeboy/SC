package top.zbeboy.sc.user1.service;

import top.zbeboy.sc.user1.domain.tables.pojos.Users;

public interface UsersService {

    /**
     * 通过账号查询
     *
     * @param username 账号
     * @return 用户
     */
    Users findByUsername(String username);
}
