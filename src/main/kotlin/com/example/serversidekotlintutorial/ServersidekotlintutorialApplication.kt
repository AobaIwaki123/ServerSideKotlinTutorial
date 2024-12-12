package com.example.serversidekotlintutorial

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ServersidekotlintutorialApplication

fun main(args: Array<String>) {
    @Suppress("SpreadOperator") // 追加
    runApplication<ServersidekotlintutorialApplication>(*args)
}
