package top.zshan.springcloud.service;

import org.apache.ibatis.annotations.Param;
import top.zshan.springcloud.entities.Payment;

/**
 * @author SansZhu
 * @create 2022/5/27 19:16
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id")Long id);
}
