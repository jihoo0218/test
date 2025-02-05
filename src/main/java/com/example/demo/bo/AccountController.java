package com.example.demo.bo;

import com.example.demo.form.LoginForm;
import com.example.demo.service.AccountService;
import com.example.demo.vo.AccountVO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
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
    public String join(AccountVO accountVO) {
        accountService.join(accountVO);
        return "redirect:/";
    }

    @GetMapping("/login")
    public String loginPage(){
        return "account/login";
    }
    @PostMapping("/login")
    public String login(LoginForm loginForm, HttpServletRequest request){
        System.out.println(loginForm);
        try{

        accountService.login(loginForm, request);
        }catch (IllegalStateException e){
            e.printStackTrace();
            return "redirect:/login";
        }
        return "redirect:/";
    }
    @GetMapping("/logout")
    public String logout(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.invalidate();
        return "redirect:/";
    }

}