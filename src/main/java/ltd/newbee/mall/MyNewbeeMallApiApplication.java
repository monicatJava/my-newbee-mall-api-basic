package ltd.newbee.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("ltd.newbee.mall.dao") // 添加 ＠Ｍapper annotation
public class MyNewbeeMallApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyNewbeeMallApiApplication.class, args);
	}

}
