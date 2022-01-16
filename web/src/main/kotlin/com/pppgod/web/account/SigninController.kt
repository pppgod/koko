package com.pppgod.web.account

import com.pppgod.web.account.dto.SigninDto
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/signin")
class SigninController {

    @GetMapping
    fun enterSigninPage(model: Model): String {
        return "contents/account/signin"
    }

    @PostMapping
    fun signin(@ModelAttribute signinDto: SigninDto): String {
        return "contents/home"
    }
}