package com.example.demo.mapper;

import com.example.demo.form.LoginForm;
import com.example.demo.vo.AccountVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;


@Mapper
public interface AccountMapper {
    void join(AccountVO accountVO);

    Map<String, String> findAccountInfo(LoginForm loginForm);
}
