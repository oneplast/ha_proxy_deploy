package io.devground.deploy_ha_proxy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DeployHaProxyApplication

fun main(args: Array<String>) {
    runApplication<DeployHaProxyApplication>(*args)
}
