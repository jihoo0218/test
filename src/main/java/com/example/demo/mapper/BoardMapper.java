package com.example.demo.mapper;

import com.example.demo.vo.BoardVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
    void saveBoard(BoardVO boardVO);
}
