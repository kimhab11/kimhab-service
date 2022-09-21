package com.hrd.task

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.config.Task

@SpringBootApplication
class TaskApp {
}
fun main(arg: Array<String>){
    runApplication<TaskApp>(*arg)
}