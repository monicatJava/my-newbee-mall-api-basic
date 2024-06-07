package ltd.newbee.mall;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class MyNewbeeMallApiApplicationTests {

    // 注入data object
    @Autowired()
    private DataSource defaultDataSource;

    //@Test
    public void datasourceTest() throws SQLException {

        Connection connection = defaultDataSource.getConnection();
        System.out.println("獲取連線");
        System.out.println(connection != null);
       // connection.close();
    }

   // @Test
    void contextLoads() {
    }
}
