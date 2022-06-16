package top.zshan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author SansZhu
 * @create 2022/6/7 18:45
 */


@SpringBootApplication
@EnableFeignClients
public class FeignOrderMain {
    public static void main(String[] args) {
        SpringApplication.run(FeignOrderMain.class,args);
    }
}
