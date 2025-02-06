package com.example.demo.service;

import com.example.demo.mapper.BoardMapper;
import com.example.demo.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardMapper boardMapper;

    public void saveBoard(BoardVO boardVO) {
        boardMapper.saveBoard(boardVO);
    }
}
