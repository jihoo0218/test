package com.example.demo.service;

import com.example.demo.form.LoginForm;
import com.example.demo.mapper.AccountMapper;
import com.example.demo.vo.AccountVO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.apache.commons.codec.digest.Crypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AccountService {
    @Autowired AccountMapper accountMapper;

    @Value("${password-crypt-key}")
    private String encodingSalt;

    public void join(AccountVO accountVO) {
        String encodedPassword = Crypt.crypt(accountVO.getPassword(), encodingSalt);
        accountVO.setPassword(encodedPassword);

        accountMapper.join(accountVO);
    }

    public void login(LoginForm loginForm, HttpServletRequest request) {
        Map<String, String> joinedAccount = accountMapper.findAccountInfo(loginForm);
        if(joinedAccount == null){
            throw new IllegalStateException("일치하는 정보가 없습니다.");
        }
        String password = loginForm.getPassword();
        password = Crypt.crypt(password,encodingSalt);
        if(!joinedAccount.get("password").equals(password)){
            throw new IllegalStateException("일치하는 정보가 없습니다");
        }
        HttpSession session = request.getSession();
        System.out.println(session);
        String loginName = joinedAccount.get("name");
        System.out.println(loginName);
        session.setAttribute("loginName", loginName);
    }
}
