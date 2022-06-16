package top.zshan.springclou.controller;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import top.zshan.springclou.service.PaymentHystrixService;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author SansZhu
 * @create 2022/6/8 23:16
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class OrderHystrixController {

    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        return paymentHystrixService.paymentInfo_OK(id);
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
//    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1500")
//    })
    @HystrixCommand
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
        int age = 10/0;
        String s = paymentHystrixService.paymentInfo_TimeOut(id);
        return s;
    }

    public String paymentInfo_TimeOutHandler(@PathVariable("id") Integer id){

        return "消费者，80系统繁忙，请稍后再试,Id: "+id+"\t"+"o(╥﹏╥)o";

    }

    public String payment_Global_FallbackMethod(){

        return "Global 异常处理信息,Id: "+"\t"+"o(╥﹏╥)o";

    }



}
