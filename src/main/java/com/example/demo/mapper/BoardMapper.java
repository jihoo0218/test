package com.example.demo.mapper;

import com.example.demo.dto.BoardDetailDto;
import com.example.demo.dto.BoardListDto;
import com.example.demo.dto.CommentsDto;
import com.example.demo.vo.BoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface BoardMapper {
    void saveBoard(BoardVO boardVO);

    List<BoardListDto> getBoardList(Map<String, String> parameter);

    void increaseViews(int boardIdx);

    BoardDetailDto getBoardDetail(int boardIdx);

    void boardUpdate(BoardDetailDto boardDetailDto);

    void boardDelete(int boardIdx);

    List<CommentsDto> getComments(int boardIdx);
}
