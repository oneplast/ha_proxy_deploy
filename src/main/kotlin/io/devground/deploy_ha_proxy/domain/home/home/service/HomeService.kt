package io.devground.deploy_ha_proxy.domain.home.home.service

import org.springframework.stereotype.Service
import java.lang.Thread.sleep
import java.net.InetAddress

@Service
class HomeService {

    init {
        sleep(10000)
    }

    fun getGreetings(): String {

        val inetAddress = InetAddress.getLocalHost()

        return "Hello, World!, $inetAddress"
    }
}