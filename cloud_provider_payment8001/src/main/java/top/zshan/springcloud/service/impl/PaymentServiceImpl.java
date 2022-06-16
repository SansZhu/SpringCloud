package top.zshan.springcloud.service.impl;

import org.springframework.stereotype.Service;
import top.zshan.springcloud.dao.PaymentDao;
import top.zshan.springcloud.entities.Payment;
import top.zshan.springcloud.service.PaymentService;

import javax.annotation.Resource;

/**
 * @author SansZhu
 * @create 2022/5/27 19:17
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
