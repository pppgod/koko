package com.pppgod.web.account

import com.pppgod.web.account.dto.SignupDto
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/signup")
class SignupController {

    @GetMapping
    fun enterSignupPage(): String {
        return "contents/account/signup"
    }

    @PostMapping
    fun signup(@ModelAttribute signupDto: SignupDto): String {
        return "contents/home"
    }
}