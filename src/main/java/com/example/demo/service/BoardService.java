package com.example.demo.service;

import com.example.demo.dto.BoardDetailDto;
import com.example.demo.dto.BoardListDto;
import com.example.demo.mapper.BoardMapper;
import com.example.demo.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardMapper boardMapper;

    public void saveBoard(BoardVO boardVO) {
        boardMapper.saveBoard(boardVO);
    }

    public List<BoardListDto> getBoardList() {
        return boardMapper.getBoardList();
    }

    public void increaseViews(int boardIdx) {
        boardMapper.increaseViews(boardIdx);
    }

    public BoardDetailDto getBoardDetail(int boardIdx) {
        return boardMapper.getBoardDetail(boardIdx);
    }
}
