package ltd.newbee.mall.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import ltd.newbee.mall.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@Tag(name = "測試c", description = "測試Swagger")
@RestController
public class TestSwaggerController {
    static Map<Integer, User> usersMap = Collections.synchronizedMap(new HashMap<>());

    static {
        User user = new User();
        user.setId(1);
        user.setName("newbee1");
        user.setPassword("111111");
        User user2 = new User();
        user2.setId(1);
        user2.setName("newbee1");
        user2.setPassword("222222");
        usersMap.put(1, user);
        usersMap.put(2, user2);
    }

    @Operation(summary = "獲取用戶列表", description = "", tags = {"測試getUserList"})
    @RequestMapping("/test/swagger/users")
    public List<User> getUserList() {
        List<User> users = new ArrayList<>(usersMap.values());
        return users;
    }

    @Operation(summary = "新增使用者", description = "", tags = {"測試postUser"})
    @PostMapping("/test/swagger/users")
    public String postUser(@Parameter(description = "新增使用者資料結構") @RequestBody User user) {
        usersMap.put(user.getId(), user);
        return "insert success";
    }
}
