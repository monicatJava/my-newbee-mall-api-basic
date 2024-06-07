package ltd.newbee.mall.controller;

import io.micrometer.common.util.StringUtils;
import jakarta.annotation.Resource;
import ltd.newbee.mall.dao.UserDao;
import ltd.newbee.mall.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyBatisController {

    @Resource
    UserDao userDao;


    /**
     * 查詢
     *
     * @return
     */
    @GetMapping("/users/mybatis/queryAll")
    public List<User> queryAll() {
        return userDao.findAllUsers();
    }

    // 新增
    @GetMapping("/user/mybatis/insert")
    public Boolean save(String name, String password) {
        if (StringUtils.isEmpty(name) || StringUtils.isEmpty(password)) {
            return false;
        }
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        return userDao.insertUser(user) > 0;
    }

    // 修改
    @GetMapping("/users/myBatis/upddate")
    public Boolean update(Integer id, String name, String password) {
        if (id == null || id < 1 || StringUtils.isEmpty(name) || StringUtils.isEmpty(password)) {
            return false;
        }
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setPassword(password);
        return userDao.updUser(user) > 0;
    }

    // 刪除
    @GetMapping("/user/mybatis/delete")
    public Boolean delete(Integer id) {
        if (id == null || id < 0) {
            return false;
        }
        return userDao.delUser(id) > 0;
    }

}
