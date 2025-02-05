package com.example.demo.service;

import com.example.demo.mapper.AccountMapper;
import com.example.demo.vo.AccountVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired AccountMapper accountMapper;
    public void join(AccountVO accountVO) {
        accountMapper.join(accountVO);
    }
}
