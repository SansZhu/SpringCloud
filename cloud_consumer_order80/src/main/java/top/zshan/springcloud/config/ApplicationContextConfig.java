package top.zshan.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author SansZhu
 * @create 2022/5/27 21:43
 */
@Configuration
@LoadBalancerClients(@LoadBalancerClient(value = "CLOUD-PAYMENT-SERVICE",configuration = CustomLoadBalancerConfiguration.class))
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
