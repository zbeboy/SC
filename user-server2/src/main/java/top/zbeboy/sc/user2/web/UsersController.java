package top.zbeboy.sc.user2.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import top.zbeboy.sc.user2.domain.tables.pojos.Users;
import top.zbeboy.sc.user2.service.UsersService;

import javax.annotation.Resource;

@RestController
public class UsersController {

    @Resource
    private UsersService usersService;

    @GetMapping("/user/{username}")
    public Users getUser(@PathVariable("username") String username) {
        return usersService.findByUsername(username);
    }
}
