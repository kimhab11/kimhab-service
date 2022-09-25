//package com.hrd.gateway;
//
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class SpringCloudGatewayRouting {
//
//    @Bean
//    public RouteLocator configureRoute(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("paymentId", r->r.path("/cus/**").uri("http://localhost:8081")) //static routing
//                .route("orderId", r->r.path("/fraud/**").uri("lb://FRAUD")) //dynamic routing
//                .build();
//    }
//}