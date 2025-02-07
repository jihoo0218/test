package com.example.demo.service;

import com.example.demo.mapper.CommentMapper;
import com.example.demo.vo.CommentsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentMapper commentMapper;

    public void enrollComments(CommentsVO commentsVO) {
        commentMapper.enrollComments(commentsVO);

    }
}
