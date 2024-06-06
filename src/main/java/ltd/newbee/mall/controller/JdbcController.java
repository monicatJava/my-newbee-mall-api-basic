package ltd.newbee.mall.controller;

import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class JdbcController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/insert")
    public String insert(String type, String name) {
        if (StringUtils.isEmpty(type) || StringUtils.isEmpty(name)) {
            return "參數異常";
        }
        jdbcTemplate.execute("INSERT INTO testdb.jdbc_test\n" +
                "(ds_type, ds_name)\n" +
                "VALUES(\"" + type + "\",\"" + name + "\")");
        return "執行完畢";
    }


    @GetMapping("/delete")
    public String delete(int id) {
        if (id < 0) {
            return "參數異常";
        }

        List<Map<String, Object>> result = jdbcTemplate.queryForList("SELECT ds_id, ds_type, ds_name\n" +
                "FROM testdb.jdbc_test where ds_id=\"" + id + "\"");

        if (CollectionUtils.isEmpty(result)) {
            return "不存在該紀錄, 刪除失敗";
        }
        jdbcTemplate.execute("DELETE FROM testdb.jdbc_test\n" +
                "WHERE ds_id=\"" + id + "\"");

        return "執行完畢";
    }
}
