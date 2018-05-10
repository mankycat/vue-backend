package brucewu.cc.church;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("brucewu.cc.church.mapper")
public class ChurchApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChurchApplication.class, args);
	}
}
