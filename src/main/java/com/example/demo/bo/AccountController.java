package com.example.demo.bo;

import com.example.demo.service.AccountService;
import com.example.demo.vo.AccountVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/join")
    public String joinPage() {
        System.out.println("조인페이지");
        return "account/join";
    }
    @PostMapping("/join")
    public String join(AccountVO accountVO){
        accountService.join(accountVO);
        return "redirect:/";
    }
}