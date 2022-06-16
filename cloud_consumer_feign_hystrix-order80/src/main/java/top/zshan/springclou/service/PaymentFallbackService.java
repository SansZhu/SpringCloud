package top.zshan.springclou.service;

import org.springframework.stereotype.Component;

/**
 * @author SansZhu
 * @create 2022/6/9 20:27
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-------------PaymentFallbackService fall back payment_ok--------------";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-------------PaymentFallbackService fall back payment_timeout--------------";
    }
}
