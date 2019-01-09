package cn.edu.whu.mathmodel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.edu.whu.mathmodel.dao")
@SpringBootApplication
public class MathModelApplication {

    public static void main(String[] args) {
        SpringApplication.run(MathModelApplication.class, args);
    }

}

