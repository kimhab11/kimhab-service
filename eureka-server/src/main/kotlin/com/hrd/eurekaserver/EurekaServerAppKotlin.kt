package com.hrd.eurekaserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class EurekaServerAppKotlin {
}

fun main(arg: Array<String>) {
    runApplication<EurekaServerAppKotlin>(*arg)
}