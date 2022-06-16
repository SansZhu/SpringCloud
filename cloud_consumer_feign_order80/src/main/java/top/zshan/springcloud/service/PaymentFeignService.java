package top.zshan.springcloud.service;

import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import top.zshan.springcloud.entities.CommonResult;
import top.zshan.springcloud.entities.Payment;

/**
 * @author SansZhu
 * @create 2022/6/7 18:48
 */
@Component
@FeignClient("CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);


    @GetMapping("/payment/feign/timeout")
    public String paymentFeignTimeOut();
}
