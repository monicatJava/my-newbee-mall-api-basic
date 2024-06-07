package ltd.newbee.mall.dao;

import ltd.newbee.mall.entity.User;

import java.util.List;

public interface UserDao {
    /**
     * 返回資料列
     *
     * @return
     */
    List<User> findAllUsers();

    /**
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     * @param user
     * @return
     */
    int updUser(User user);

    /**
     * @param id
     * @return
     */
    int delUser(Integer id);

}