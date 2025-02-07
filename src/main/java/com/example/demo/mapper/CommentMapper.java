package com.example.demo.mapper;

import com.example.demo.vo.CommentsVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentMapper {

    void enrollComments(CommentsVO commentsVO);
}
