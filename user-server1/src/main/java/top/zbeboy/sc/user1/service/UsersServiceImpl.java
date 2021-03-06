package top.zbeboy.sc.user1.service;

import org.springframework.stereotype.Service;
import top.zbeboy.sc.user1.domain.tables.daos.UsersDao;
import top.zbeboy.sc.user1.domain.tables.pojos.Users;

import javax.annotation.Resource;

@Service("usersService")
public class UsersServiceImpl implements UsersService {

    @Resource
    private UsersDao usersDao;

    @Override
    public Users findByUsername(String username) {
        return usersDao.findById(username);
    }
}
