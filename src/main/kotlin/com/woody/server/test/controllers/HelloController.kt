package com.woody.server.test.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    fun test(): String {
        return "Hello Test Server"
    }
}