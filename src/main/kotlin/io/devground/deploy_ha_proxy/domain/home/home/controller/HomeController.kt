package io.devground.deploy_ha_proxy.domain.home.home.controller

import io.devground.deploy_ha_proxy.domain.home.home.service.HomeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController(
    private val homeService: HomeService
) {

    @GetMapping("/")
    fun main(): String {
        return homeService.getGreetings()
    }
}