package com.hrd.user

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class UserApp
    fun main(arg: Array<String>){
        runApplication<UserApp>(*arg)
}