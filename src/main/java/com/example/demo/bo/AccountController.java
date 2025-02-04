package com.example.demo.bo;

import ch.qos.logback.core.joran.spi.ConsoleTarget;
import com.example.demo.vo.AccountVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.logging.SocketHandler;

@Controller
public class AccountController {
    @GetMapping("/join")
    public String joinPage(){
        System.out.println("조인페이지");
        return "account/join";
    }
    @PostMapping("/join")
    public String join(AccountVO accountVO){
        System.out.println(accountVO);
        return "redirect:/";
    }
}
