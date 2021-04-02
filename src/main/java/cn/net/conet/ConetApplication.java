package cn.net.conet;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("cn.net.conet.mybatisplus.mapper")
@SpringBootApplication
public class ConetApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConetApplication.class, args);
    }

}
