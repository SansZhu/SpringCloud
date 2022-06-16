package top.zshan.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author SansZhu
 * @create 2022/6/15 17:57
 */
@Configuration
public class GatewayContextConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route("path_route", r -> r.path("/guonei").uri("http://news.baidu.com/"))
                .build();
    }
}
