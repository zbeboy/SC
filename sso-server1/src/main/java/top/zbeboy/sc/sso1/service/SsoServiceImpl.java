package top.zbeboy.sc.sso1.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.RestTemplate;
import top.zbeboy.sc.sso1.pojos.Users;

import javax.annotation.Resource;

@Service("ssoService")
public class SsoServiceImpl implements SsoService {

    @Resource
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "checkFailBackMethod")
    @Override
    public Users checkUser(String username, String password) {
        String serviceId = "user-server";
        Users users = restTemplate.getForObject("http://" + serviceId + "/user/" + username, Users.class);
        if (!ObjectUtils.isEmpty(users)) {
            String pwd = users.getPassword();
            if (StringUtils.equals(pwd, password)) {
                return users;
            }
        }
        return null;
    }

    public Users checkFailBackMethod(String username, String password) { // 容错保护
        return new Users("未获取到用户", null, null, null, null, null, null, null, null, null, null, null, null);
    }
}
