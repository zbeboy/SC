package top.zbeboy.sc.sso1.web;

import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import top.zbeboy.sc.sso1.pojos.OptResult;
import top.zbeboy.sc.sso1.pojos.Users;
import top.zbeboy.sc.sso1.service.SsoService;

import javax.annotation.Resource;

@RestController
public class SsoController {

    @Resource
    private SsoService ssoService;

    @GetMapping("/login/{username}/{password}")
    public OptResult login(@PathVariable("username") String username, @PathVariable("password") String password) {
        Users users = ssoService.checkUser(username, password);
        if (ObjectUtils.isEmpty(users) || ObjectUtils.isEmpty(users.getPassword())) {
            return new OptResult(1, "登录失败", users);
        }

        return new OptResult(1, "登录成功", users);
    }
}
