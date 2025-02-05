package com.example.demo.mapper;

import com.example.demo.vo.AccountVO;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface AccountMapper {
    void join(AccountVO accountVO);
}
