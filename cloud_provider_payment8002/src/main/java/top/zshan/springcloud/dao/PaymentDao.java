package top.zshan.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.zshan.springcloud.entities.Payment;

/**
 * @author SansZhu
 * @create 2022/5/27 18:56
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id")Long id);
}
